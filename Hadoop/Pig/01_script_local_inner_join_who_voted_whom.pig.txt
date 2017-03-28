A = LOAD '/root/Desktop/pig/student_data.txt' AS (student_id:int, student_name:chararray, age:int, gpa:float);
B = LOAD '/root/Desktop/pig/voter_data.txt' AS (party_id:int, voter_id:int, party_name:chararray, contributions:float);
C = JOIN A BY student_id, B BY voter_id;
F = FOREACH C GENERATE student_id, student_name, party_name;
DUMP F;
