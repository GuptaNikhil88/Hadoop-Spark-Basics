records = LOAD '/root/Desktop/pig/split_data.txt' AS (year:int, temp:int, quality:int);
SPLIT records INTO good_records IF temp is not null, bad_records IF temp is null;
DUMP good_records ;
DUMP bad_records;

