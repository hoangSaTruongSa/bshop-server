INSERT INTO car (license_plate, repair_date , customer_name           , catalog          , car_maker)
VALUES          ('29V7-65366' , '2003-11-16', 'Nguyễn Thị Thành', 'Bảo dưỡng lần 1', 'Honda'  ),
                ('29V7-54143' , '2021-03-05', 'Nguyễn Văn Bộ'       , 'Bảo dưỡng lần 4', 'Toyota' ),
                ('39V7-57123' , '2021-03-05', 'Nguyễn Văn A'       , 'Bảo dưỡng lần 4', 'Toyota' ),
                ('69V7-59143' , '2021-03-05', 'Nguyễn Văn B'       , 'Bảo dưỡng lần 4', 'Toyota' ),
                ('89V7-50153' , '2021-03-05', 'Nguyễn Văn C'       , 'Bảo dưỡng lần 4', 'Toyota' );

INSERT INTO accessory (license_plate, repair_date , name         , price  , status_damaged, repair_status)
VALUES                ('29V7-54143' , '2021-03-05', 'Cần gạt mưa', 999000 , 'Bị gãy'      , 'Thay mới'   ),
                      ('29V7-65366' , '2003-11-16', 'Lọc gió'    , 199000 , 'Bị bụi bẩn'  , 'Làm sạch'   ),
                      ('29V7-65366' , '2003-11-16', 'Lốp xe'     , 2000000, 'Bị thủng'    , 'Thay lốp'   ),
                      ('29V7-65366' , '2003-11-16', 'Bình ắc quy', 1465000, 'Bị hết điện' , 'Sạc điện'   ),
                      ('29V7-65366' , '2003-11-16', 'Đèn xe'     , 369000 , 'Bị vỡ'       , 'Thay đèn'   );

INSERT INTO role (type)
VALUE            ("ADMIN"),
                  ("USER");