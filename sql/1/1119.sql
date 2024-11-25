
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





----decode 문
------- 1118
---P.170
select empno, ename, job, sal,
decode(job
'MANAGER', sal * 1.1,
'SALESMAN', sal * 1.05,
'ANALYST', sal,
sal * 1.03) as sal
from emp;

------- CASE문
----- P.172
select empno, ename, job, sal,
case job
when 'MANAGER' then sal * 1.1
when 'SALESMAN' then sal * 1.05
when 'ANALYST' then sal
else sal*1.03
end as upsal
from emp;

----- CASE문 2
------p.173
select 
case 
when comm is null then '없음'
when comm = 0 then '수당없음'
when comm > 0 then '수당:' || comm
end as comm_text
from emp;

----- comm이 null 인 경우 'N/A'
----- null이 아닌경우 comm
select 
case
when comm is null then 'N/A'
--- 밑 둘 중 하나
when comm is not null then '' || comm
else  '' || comm
end as good
from emp;

---- 이름, 봉급, 추가수당, 봉급+추가수당
select ename, sal, comm, sal+comm,
sal + nvl(comm, 0),
sal + decode(comm, null, 0)
from emp;




-------문제2
/* select empno, , job, ename, sal,
dec (sal,
when 'sal', sal / 21.5,
when 'sal', (sal / 21.5) / 8,
) as DAY_PAY
from emp; */

select empno, ename, sal, 
trunc(sal/21.5, 2) day_pay,
round((sal/21.5, 2)/8, 1) time_pay
from emp;

-------문제4
select empno, ename, mgr,
case 
when MGR is null then 0000
when substr(MGR,1,2) = '75' then 5555
when substr(MGR,1,2) = '76' then 6666
when substr(MGR,1,2) = '77' then 7777
when substr(MGR,1,2) = '78' then 8888
else MGR
end as CHG_MGR
from emp;



---------- 다중 함수
----SUM 함수
----p.179
select sum (comm) from emp;
select sum (sal + comm) from emp;
----??
----nvl (comm이 널이면 0)
select sum (sal + nvl(comm,0)) from emp;

-- count도 sum처럼 null은 제외함
-- count에는 *를 많이 씀
select count(*), count(sal), count(comm) from emp;
select *
from emp;
----MIN. MAX 함수
select max(sal), max(ename), min(sal), min(hiredate), min(comm) from emp;

select * from emp
order by comm desc;

--- 오류1: 그룹이 아닌애가 껴있다.
--- 다중은 다중끼리 한줄은 한줄끼리
select count(*), sum(sal), sal from emp;

select count(*) from emp
-- 조건
where deptno = 30
--- ?
and comm is not null;

--응용.
---- 이름에 A가 포함된 사람 수는?
--- select count(ename) like '%A%' from emp;
select count(*) from emp
where ename like '%A%';

--- 최대 연봉을 받는 모든 사람 정보 표시
select max(sal) from emp
order by sal desc;
-- 오류: where에서 다중행 함수(집계 함수)를 사용할 수 없음
select * from emp
where sal = max(sal);

----- Groupby 함수(비효율)
select '10',sum(sal), avg(sal) from emp where deptno = 10
union all
select '20',sum(sal), avg(sal) from emp where deptno = 20
union all
select '30',sum(sal), avg(sal) from emp where deptno = 30;
---------- 축약(효율)p.187
select avg(sal), deptno
from emp
group by deptno;

----distinct. group by
select deptno, job, sal, avg(sal), sum(sal), count(*)
from emp
group by deptno, job, sal
order by deptno, job, sal;

-------having 절
----p.190
select deptno, job, avg(sal), sum(sal), count(*)
from emp
group by deptno, job
----- 조건 제한.
having avg(sal) >= 2000
order by deptno, job;

/* having : group by에서 사용
where에서 표현할 수 있는건 가급적 where에서 사용하는게 좋다
집계함수를 조건으로 주고 싶을때 사용한다
where에 못넣는것을 having에.
*/

----- Having(where)
----- 무조건 순서대로 (중요)
/* 5 */ select job, count(*)
/* 1 */ from emp
/* 2 */ where sal > 1000
/* 3 */ group by job
/* 4 */ having count(*) >= 3
/* 6 */ order by cnt desc;










------ Q1
----- group에 group함수 못씀 ! 
---- having에만 가능
-- group 함수 - count(*) ?
/* select deptno, avg(sal) AVG_SAL, max(sal) MAX_SAL, min(sal) MIN_SAL, Count(*) CNT
from emp
group by deptno, sal
order by deptno, sal; */

select deptno, floor(avg(sal)) AVG_SAL, max(sal) MAX_SAL, min(sal) MIN_SAL, Count(*) CNT
from emp
having deptno, sal, count(*)
group by deptno, sal
order by deptno, sal;

select job, count(*)
from emp
group by job;

-- 추가문제1
---1981년 입사 중 급여가 가장 낮은 사원의 정보 조회
/* select MIN(SAL) ----hiredate X
from emp
where sal <
group by ---sal, hiredateX
having hiredate like '%81%'; */

select MIN(SAL) ----hiredate X
from emp
where hiredate >= to_date('1981-01-01', 'yyyy-mm-dd')
and hiredate <= to_date('1981-12-31', 'yyyy-mm-dd')
or to_char(hiredate, 'yyyy')='1981'
or hiredate like '%81%';


-- 추가문제2
---1981년 입사 중 1981년 평균이상 받은 사원 조회
---- 서브쿼리 필요
select job, avg(sal), hiredate
from emp 
where sal > 
group by job , sal, hiredate
having hiredate like '%81%'
order by job desc;

select job, avg(sal), hiredate
from emp 
where sal > 
group by job , sal, hiredate
having hiredate like '%81%'
order by job desc;

select *
from emp;






------ 조인(필요한 것만 사기)
select *
from emp e, dept d
---- where emp.deptno = dept.deptno
where e. deptno = d. deptno
order by empno;

------- e, d(별칭)
select ename, e.deptno, e.*, D.*
from emp e, dept d
where e. deptno = d. deptno
order by empno;

select ename, sal, grade
from emp e, salgrade s
where e.sal >= s.losal
and e.sal <= s.hisal;

---- using 공통 (select x)
select *
from emp join dept using (deptno);

select *
from emp e1 join emp e2 on (e1.mgr = e2.empno);

select *
from 
where sal > 2000







-----Q1

/* select e.deptno, e.dname, e.empno, e.ename, e.sal, d.deptno, d.dname, d.empno, d.ename, d.sal
from EMP E join DEPT D on (e.deptno = d.ename)
where sal > 200 */

select e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno --?
and sal > 2000
order by deptno;


select e.empno, e.ename, d.dname, d.deptno, e.sal
from emp e join dept d on (deptno)
where sal > 2000

----Q2
select deptno, d.dname, floor(avg(sal)), max(sal), min(sal), count(*)
from emp e join dept d using (deptno)
group by deptno, d.dname;


--- 추가문제 1
--- 사원번호, 이름, 부서명, 급여등급 출력 : 14줄

select e.ename, e empno, d dname, s.grade
from emp e dept d salgrade s
/* from emp e
left outer


----- 추가문제2 
--- 상사보다 월급이 높은 사원의 이름, 급여, 상사이름, 상사급여
select e1.ename, e1.sal, e2.ename, e2.sal
from emp e1
left outer join emp e2 on(e1.mgr=e2.empno)
where e1.sal > e2.sal;




----- 서브쿼리
---p.244
select ename, sal
from emp
where sal > (select sal 
from emp 
where ename = 'JONES');

---p.247
select e.empno, e.ename, e.job, e.sal, d.deptno, d.dname, d.loc
from emp.e, dept d 
where e.deptno = d.deptno
and e.deptno = 20
and e.sal > (select avg(sal)
from emp;

----p.250
select max(sal)
from emp
group by deptno;





--------
--too many values (* X)
----select 서브쿼리에 정확한 값
---값 이름. 연산자 정확히

select *
from emp
where sal >= (select sal from emp where ename='BLAKE');

---- JONES랑 같은 job을 가진 사람들

select *
from emp
where job = (select job from emp where ename='JONES');

select *
from (select empno, deptno, ename
from emp
where deptno = 10);

----rownum  : 1을 나타냄
/* select rownum, emp.*
where rownum= 3
from emp; */



----- select문 순서 바꾸기
select *
from (select rownum, emp.*
from emp)
where rownum= 3;

select rownum as rnum, a.*
from (select *
from emp 
order by ename)
a;
 
select job, count(*) from emp
group by job
having count(*) >= 3;

select *
from ( select job, count(*) cnt from emp
group by job)
where cnt >= 3;


-------- with
with
E10 as (select * from emp where deptno = 10)
select * from e10;





-----Q1
/* select job, empno, ename, sal, deptno
from emp
where job = (select job from emp where ename = 'ALLEN') */

------- select에 서브쿼리가 있는 경우 한줄마다 조회하므로 비효율적일 수 있다.
select job, empno, ename, sal, deptno, (select dname from dept where e.deptno = dept.deptno) as DNAME ----중요
from emp e --- 중요
where job = (select job from emp where ename = 'ALLEN');


---- 다른 풀이 (강사답안. 효율적)
select job, empno, ename, sal, deptno, dname ----중요
from emp join dept using (deptno)
where job = (select job from emp where ename = 'ALLEN');


----Q2
---1. 전체 사원의 평균 급여
---2. 그것보다 높은 사람들 출력
select empno, ename, dname, hiredate, loc, sal, grade
from (select * from emp) E, (select * from salgrade) S10, (select * from dept)
where sal > (select avg(sal) from emp);


select empno, ename, dname, hiredate, loc, sal, grade
from (select * from emp) , (select * from salgrade) , (select * from dept)
where sal > (select avg(sal) from emp);


--- 모범답안
----- 조건 추가. 서브쿼리 별칭표시
select empno, ename, dname, hiredate, loc, sal, grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal >= s.losal and e.sal <=s.hisal
and e.sal > (select avg(sal) from emp)
order by sal desc, empno;


----Q3 (모범답안)
---10번 부서 사람 중, 30번 부서에 없는 직책, 30번 부서의 job들이 not in으로 10번 부서에 적용
select * from emp where deptno = 10
union all
select * from emp where deptno = 30;

select empno, ename, job, e.deptno, dname, loc
from emp e
left outer join dept d on (e.deptno = d.deptno)
where e.deptno = 10
and e.job not in (select job from emp where deptno = 30);

---Q4
select empno, ename, sal, grade
from (select * from emp) , (select * from salgrade) , (select * from dept)
where job = 'SALESMAN'
and sal > (select max(sal) from salgrade);

--- 모범답안
select empno, ename, sal, grade
from emp e
--중요
left outer join salgrade s
on (e.sal >= s.losal and e.sal <= s.hisal)
---
and sal > (select max(sal) from salgrade where job = 'SALESMAN');




select *
from emp;





-------- 1120
CREATE TABLE EMP_DDL 
empno number(4),
ename varchar2(10),
job varchar2(9),



create table emp_ddl_30
as select * from emp where deptno = 30;
select * from emp_ddl_30;

----P.315
CREATE TABLE EMPDEPT_DDL
AS SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, D.DEPTNO, D.DNAME, D.LOC
FROM EMP E, DEPT D
WHERE 1<> 1;

SELECT * FROM EMPDEPT_DDL;



------ p.317
create table emp_alter
as select * from emp;

select * from emp_alter;
---생성

------ADD (초기값 없이 Null)
select table emp_alter
add hp varchar(20);
select * from emp_alter;

-----RENAME p.318
alter table emp_alter
rename coulmn hp to tel;
select * from emp_alter;
----MODIFY ----- increse만 가능. drop등 필요
alter table emp_alter
modify empno number(5);
desc emp_alter;
----- 타입 변경시 내용이 모두 null일때만 가능
alter table emp_alter
modify hp number(20);

-----Drop
alter table emp_alter
drop column tel;
select * from emp_alter;

rename emp_alter to emp_rename;
select * from emp_rename;

truncate table emp_rename;
select * from emp_rename;

drop table emp_rename;
---- 삭제되었습니다

----- 10장 
create table dept_temp
as select * from dept;
select * from dept_temp;
--- insert
insert into dept_temp (deptno, dname, loc)
values (50, 'DATABASE', 'SEOUL');
select * from dept_temp;

---오류 P.268 - 269
---- deptno 문자X
insert into dept_temp (deptno, dname, loc)
values (50, 'DATABASE', 'SEOUL');
select * from dept_temp;

insert into dept_temp (deptno, dname, loc)
values (123, 'DATABASE', 'SEOUL');

insert into dept_temp (deptno, dname, loc)
values (123, 'NETWORK', 'BUSAN');
select * from dept_temp;

insert into dept_temp (deptno, loc)
valuese (90, 'INCHEON');
select * from dept_temp;

----P.274
insert into emp_temp (empno, ename, hired
values (2111, '이순신', to_date('2001-03-04', 'yyyy-mm-dd'));
select * from emp_temp;
----sysdate
insert into (empno, ename, hiredate)
values (3111, '춘향이', sysdate);
select * from emp_temp;
---- 한번에 여러줄
insert into emp_temp
select * from emp where deptno = 10;
select * from emp_temp;

create table dept_temp2
as select * from dept;
select * from dept_temp2

-----update(테이블 데이터 수정)
update dept_temp2
set loc = 'seoul';
select * from dept_temp2
where deptno = 40;

update dept_temp2
set dname = 'DATABASE'
loc = 'SEOUL'
where deptno = 40;

select * from dept_temp2;

select * from emp_temp;

select * from emp_temp
where sal <= 2500;

update emp_temp
set sal sal + 50
where sal <= 2500;
select * from emp_temp;


-----emp 테이블을 복사한 emp_temp2에서
----- 연봉이 1000이하인 사원 연봉을 1.3% 인상
/* update emp_temp2
set sal = sal * 1.013
where sal <= 1000;
select * from emp; */

update emp_temp2
set sal = sal * (1+0.013)
where sal <= 1000;
select * from emp_temp2;




------ delete
delete from emp_temp2
where job = 'MANAGER';
select * from emp_temp2;



----commit;

commit; ----- DB에 저장. TCL

select * from emp_temp2;
delete from emp_temp2;

rollback;
select * from emp_temp2;

delete from emp_temp2
where deptno = 10;

create table emp_temp3  --- 자동커밋
as select * from emp;
rollback;
select * from emp_temp2;




----- 데이터 사전

select * from user_tables;
select * from user_indexes;

create index idx_emp_sal
on emp (sal asc);
select * from user_indexes;

select * from emp
order by sal asc;

---- 플랜 (강제 힌트)
select /*+ index(e) */
*
from emp e
where sal = 3000
order by sal asc;
