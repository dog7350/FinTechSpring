CREATE TABLE membership(
   id VARCHAR2(20) PRIMARY KEY,
   pw VARCHAR2(100),
   addr VARCHAR2(300)
);

INSERT INTO membership VALUES('aaa', 'aaa', '���¥��');
INSERT INTO membership VALUES('bbb', 'bbb', '���˺�');

COMMIT;