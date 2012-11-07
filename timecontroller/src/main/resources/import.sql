-- You can use this file to load seed data into the database using SQL statements
insert into Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212')
insert into TimeDomain (name) values ('maszyna1')
insert into TimeDomain (name) values ('maszyna2')
insert into TimePeriod (discriminatorTimePeriod ,tId, start, finish, isneg, hour, dayOfMonth, dayOfWeek) values ('weekly', 0, 1, 4, 'false', 1, null, 1)
insert into TimePeriod (discriminatorTimePeriod ,tId, start, finish, isneg, hour, dayOfMonth, dayOfWeek) values ('weekly', 1, 2, 5, 'false', 1, null, 1)
insert into TimePeriod (discriminatorTimePeriod ,tId, start, finish, isneg, hour, dayOfMonth, dayOfWeek) values ('weekly', 2, 1, 4, 'false', 2, 2, null)
insert into TimePeriod (discriminatorTimePeriod ,tId, start, finish, isneg, hour, dayOfMonth, dayOfWeek) values ('weekly', 3, 3, 6, 'false', 1, null, 1)