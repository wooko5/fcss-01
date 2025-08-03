-- user 테이블에 테스트 데이터 삽입
INSERT INTO `spring`.`users` (`username`, `password`, `enabled`) VALUES ('ara', 'ara123', 1),
                                                                  ('mandlo', 'mandlo123', 1),
                                                                  ('hee-eun', 'heeun123', 0);

-- authorities 테이블에 테스트 데이터 삽입
INSERT INTO `spring`.`authorities` (`username`, `authority`) VALUES
                                                             ('ara', 'ROLE_ADMIN'),
                                                             ('ara', 'ROLE_USER'),
                                                             ('mandlo', 'ROLE_USER'),
                                                             ('hee-eun', 'ROLE_GUEST');
