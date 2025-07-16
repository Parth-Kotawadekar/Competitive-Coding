-- Write your PostgreSQL query statement below
with cte as (
    select player_id, event_date, 
        row_number() over (partition by player_id order by event_date) as row_number,
        lag(event_date, 1, null) over (partition by player_id order by event_date) as prev_event_date
    from activity 
    group by player_id, event_date
)
select round(
        (
            select count(*) 
            from cte t 
            where t.row_number = 2 
                and event_date = prev_event_date + 1
        )::numeric
        / 
        (
            select count(*) from cte 
            where row_number = 1
        )::numeric
    , 2) 
    as fraction