
------- 1111. 12 '테이블' 종류
select * from emp;
DESC emp;

select * from emp;
DESC salgrade;

select * from emp;
desc dept;

select EMPNO, ENAME, DEPTNO
from EMP;

SELECT 
    DISTINCT job, deptno
FROM EMP;

--- 별칭
select 
     ename,
     sal,
     sal * 12 + comm "올해 연봉",
     comm
from emp;

------ 정렬
select * from emp
order by sal;

select * from emp
order by job;



---------- where절
SELECT *
FROM EMP
WHERE EMPNO = 7782;

SELECT EMPNO "EMPLOYEE_NO", ENAME "EMPLOYEE_NAME", MGR "MANAGER", SAL "SALARY", COMM "COMMISION", DEPTNO "DEPARTMENT_NO"
FROM EMP
ORDER BY DEPTNO desc; ENAME;

--- distinct (중복제거)
SELECT DISTINCT JOB
FROM EMP;


------ 연산자
select * from emp
where deptno = 20;

select * from emp
where deptno = 20;

SELECT * from emp
where empno = 7499
and deptno = 30;

SELECT * from emp
where (ename = 'WARD' or job = 'CLERK') and deptno = 20;

select * from emp
where 1 = 1;

Select *
from emp
where sal >= 2500
and job = 'ANALYST';















--- 1113 --
select *
from emp
where sal >= 2000 and sal < 3000;
/* 항목은 하나씩만, and or 사용, ;문장끝 필수*/

select *
from emp
where sal <> 3000;

-- 문제1. 부서번호가 20도 아니고 10도 아님
select *
from emp
where deptno != 20 and deptno != 10

-- 문제2. 부서번호가 20이 아님
select *
from emp
where deptno != 20;

-- 문제3. 부서번호가 30이면서 봉급 2000 이하
select *
from emp
where deptno = 30 and sal <= 2000;

---- 2000 미만 또는 3000이상 출력
select * from emp
where sal <2000 or sal >= 3000;

---- 2000 이상 그리고 3000 미만이 아닌것 (위와 동일)
select * from emp
where not ( sal >= 2000 and sal <3000);

--IN 연산자 (중복제거)
select * from emp
WHERE JOB IN ('MANAGER', 'SALESMAN', 'CLERK');
----예제 1
select * 
from emp
where deptno not in ('10', '20');


---- between 연산자
select *
from emp
between 2000 and 3000;

------like 연산자 (어떤문자)
-- 시작
select *
from emp
where ename like 'S%';

-- 두번째 글자
select *
from emp
where ename like '_S%';

-- 문자 포함
select *
from emp
where ename like '%S%';

---- Null 출력
select * from emp
where comm is null;

select * from emp
where mgr is null;

------- UNION (2개 이상 집합) * 컬럼 개수 다름에 오류
select empno, ename, sal, deptno
from emp where deptno = 10
union
select empno, ename, sal
from emp where deptno = 20;

---- *위치바꿈
---- *타입이 다름 (세부내용은 괜찮음)에 오류
select empno, ename, sal, deptno
from emp where deptno = 10
union
select ename, empno, sal, deptno
from emp where deptno = 20;

----- *중복제거 후 출력
select empno, ename, sal, deptno
from emp where deptno = 10
union
select empno, ename, sal, deptno
from emp where deptno = 10;

-----UNION ALL
--- 모든 줄 표시 합집합 (전부 표시). 중복 있음
select empno, ename, sal, deptno
from emp where deptno = 10
union all
select empno, ename, sal, deptno
from emp where deptno = 10;





--- Q4 not (sal < 2000 and sal > 3000)과 같음
select *
from emp
where sal >= 2000 and sal <=3000;

--- Q1
select *
from emp
where ename like '%S';

--- Q5
select ename, empno, sal, deptno
from emp
where ename like '%E%' and deptno = 30; and sal not between 1000 and 2000;

--- Q3 not like
select empno, ename, sal, deptno
from emp
where deptno = 20 and sal > 2000
union 
select empno, ename, sal, deptno
from emp
where deptno = 30 and sal > 2000;
---- in (20, 30)
select empno, ename, job, sal, deptno
from emp
where deptno in (20, 30) and sal > 2000;



---- Q2 = 30 job = salesman
select empno, ename, job, sal, deptno
from emp
where deptno = 30 and job ='SALESMAN';

-----Q6 ' 값(대문자 소문자 구분)
select * 
from emp
where comm is null
and mgr is not null
and job in ('MANAGER', 'CLERK')
and ename not like '_L%';




----- 함수
select upper ('abcDe')
from dual;

select lower ('abcDe')
from dual;

select lower (ename)
from emp;

------ 대문자 안에 지정된 형식이 들어감(참고)
select upper (lower (ename))
from emp;




------ 대소문자 구분없이 검색 (중요)
select * from emp
where ename like '%A%' or ename like '%a%';

/* AB Ab aB ab -??*/ 
select * from emp
where lower(ename) like lower('%Mi%');

--length: 문자 개수
select ename, length(ename) from emp;

select length('abc'), length('한글'), from dual;

select ename, length(ename) from emp
where length(ename) >=5;

select length('abc'), lengthb('한글') from dual;










---------1114 Substr. replace
select job,
substr (job, 1, 2), -- 앞에서 2글자만. !
substr (job, 4), -- 4번째부터 끝까지.
substr (job, 4, 100), --- 끝 위치가 많아도 ㄱㅊ아염
substr (job, 44, 100), --- 시작위치가 커지면 null
length ( substr (job, 4) ),
substr (job, -4), ---- 맨 뒤부터 4글자. job, 4의 역순. !
substr (job, -3, 1) ---- 맨 뒤부터 3글자중 첫번째
from emp;

select 
     '010-2046-7051',
     replace('010-2046-7051', '-', '🤦‍♀️'),
     replace('010-2046-7051', '-')
from dual;



--- 문제1 ename 앞에서 2글자만 출력
--- 문제2-0 ename에서 A만 *로 처리
--- 문제2 ename에서 앞에 두글자만 *로 처리 "**ITH"
--- 문제3-0 ename의 반절에 해당하는 길이를 출력
--- 문제3-1 ename의 앞에 반절 모두 *로 처리 '*NER', '*TH', '*ITH' !
--- 문제3-2 ename의 뒤에 반절 모두 *로 처리 'TUR*' !


select 
substr(ename, 1, 2),
replace (ename , 'A', '*'), 
replace (ename , substr (ename, 1, 2), '*'),

length  (ename) / 2,
replace (ename , substr (ename, 1, length (ename) /2), '*'),
replace (ename , substr (ename, (length (ename) /2)+1), '*')

from emp;


--- 문제1 ename 앞에서 2글자만 출력
--- 문제2-0 ename에서 A만 *로 처리
--- 문제2 ename에서 앞에 두글자만 *로 처리 "**ITH"
--- 문제3-0 ename의 반절에 해당하는 길이를 출력
--- 문제3-1 ename의 앞에 반절 모두 *로 처리 '*NER', '*TH', '*ITH' !
--- 문제3-2 ename의 뒤에 반절 모두 *로 처리 'TUR*' !


select 
substr(ename, 1, 2),
replace(ename, 'A' ,'*'),
length(ename),
replace(ename, substr(ename,length(ename)),'*'),
replace(ename, substr(ename,1,length(ename)),'*')
from emp;






-------- RPAD, LPAD
select
     'Oracle',
     lpad('Oracle', 10, '###'),
     lpad('Oracle', 10),
     rpad('Oracle', 10, '*'),
     rpad('Oracle', 10)
     from dual;
     
---- 이름을 6자리로 만들고 오른쪽 빈 공간은 *로 채운다

select 
    ename,
    rpad(ename, 6, '*')
from emp;



-----응용
select 
    ename,
    lpad(ename, length(ename)*2 , '*')
from emp;

-----응용2: 뒤 4자리를 *로 바꾸기. 1. replace대체 or rpad로채우기
select
'010-2046-7051',
length('010-2046-7051'),
substr('010-2046-7051',1,length('010-2046-7051')-4),
--- substr('010-2046-7051',1,length('010-2046-7051')-4) = 010-2046
rpad(substr('010-2046-7051',1,length('010-2046-7051')-4),length('010-2046-7051'),'*')
from dual;

-----TRIM
select
'                          a               b        cd               ',
trim('                          a               b        cd               ')
from dual;











----- 문제1 사원 이름을 앞에 두글자만 보이게하고 나머지 *
----- 문제2 사원 이름의 앞글자 하나만 *로

select ename,
substr (ename, 1,1),
rpad (substr (ename, 1,2), length(ename) ,'*'), -- 직접완료
lpad (substr (ename, 2), length(ename) ,'*')
from emp;






-------- 1115

----- 반올림 (round)
--- <소수점 첫째자리>까지 보여준다
select round (14.46 ,1),
--- 자연수 0의 자리까지 보여준다
round (14.46 ,0),
--- 자연수 둘째자리까지 보여준다
round (14.46 ,-1)
from dual;



------ trunc
select trunc (14.46,1)
from dual;

-------- ceil : 나보다 바로 큰 정수
---- floor (가장 가까운 정수) : 나보다 바로 작은 정수
select ceil (3.14),
floor (-3.14)
from dual;


----- mod 
select 
mod(15,6)
from dual;


-------sysdate
--- 현 오라클 설치 pc 시간
------- 설정에 따라 기본 출력값이 다를 수 있음
select 
sysdate,
sysdate+1,
sysdate-1
from dual;

------------- MOD

select 
mod(3,2)
from dual;



------- MONTH

select sysdate,
ADD_MONTHS (sysdate, 3)
from dual;

select hiredate,
ADD_MONTHS (hiredate, 120)
from emp;






------- 자료 변환
----- 컬럼에 +를 적으면 <숫자>로 변환
----- 문자 적을시 invald error
select empno, empno + 'sd'
from emp;

----- ||를 적으면 모두 문자로 변경해서 적용
select empno, empno || 'abcd' from emp;


----- Char 날짜. 숫자 데이터를 문자 데이터로 변용
select to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss')
from dual;

select to_char(sysdate, 'dd')
from dual;



-----응용: 언어 변경
select to_char(sysdate, 'month', 'NLS_DATE_LANGUAGE = spanish')
from dual;



------------ date 문자 데이터를 날짜 데이터로 변경
select to_date('20250502', 'YY-mm-dd') from dual;
select to_char(sysdate, 'yyyy-mm-dd') from dual;

----- 응용
select to_date('20240502', 'yyyy/mm/dd') - to_date('20241115', 'yyyy/mm/dd')
from dual;


----- 응용 where 정보찾기
select * from emp
where hiredate > to_date('1981/06/01', 'yyyy/mm/dd');



----- null 처리 함수
select comm, sal,
NVL2(comm, '0','2')
from emp;
