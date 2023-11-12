INSERT INTO car (license_plate, repair_date , customer_name           , catalog          , car_maker)
VALUES          ('70L1-88888' , '2003-11-16', 'Nguyễn Thị Thành', 'Bảo dưỡng lần 1', 'Honda'  ),
                ('98B2-66666' , '2021-03-05', 'Nguyễn Văn Bộ'       , 'Bảo dưỡng lần 4', 'Toyota' );

INSERT INTO accessory (license_plate, repair_date , name         , price  , status_damaged, repair_status)
VALUES                ('98B2-66666' , '2021-03-05', 'Cần gạt mưa', 999000 , 'Bị gãy'      , 'Thay mới'   ),
                      ('70L1-88888' , '2003-11-16', 'Lọc gió'    , 199000 , 'Bị bụi bẩn'  , 'Làm sạch'   ),
                      ('70L1-88888' , '2003-11-16', 'Lốp xe'     , 2000000, 'Bị thủng'    , 'Thay lốp'   ),
                      ('70L1-88888' , '2003-11-16', 'Bình ắc quy', 1465000, 'Bị hết điện' , 'Sạc điện'   ),
                      ('70L1-88888' , '2003-11-16', 'Đèn xe'     , 369000 , 'Bị vỡ'       , 'Thay đèn'   );