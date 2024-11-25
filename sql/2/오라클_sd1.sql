select * from emp;
desc emp;

select * from dept;
desc dept;

select * from salgrade;
desc salgrade;

select 
    empno, 
    ename, 
    deptno 
  from 
    emp;

select deptno
from emp;

select
    distinct deptno
from emp;

select
    distinct/*중복 제거 */ job
from emp;

/* 범위주석 
아무거나
심지어 여러줄
*/

-- 한줄 주석

select 
    distinct job, deptno
from emp;


select 
    ename, 
    sal, 
    sal * 12 + comm, 
    comm
from emp;

select 
    ename, 
    sal, 
    sal * 12 + comm as 연봉, 
    comm
from emp;

select 
    ename, 
    sal as sal2, 
    sal * 12 + comm "올해 연봉", 
    comm 
from emp;

select * from emp
order by sal asc;

select * from emp
order by sal desc;

select * from emp
order by job;

select * from emp
order by job asc, sal asc;


select ename 
from emp
order by empno desc, job asc, sal asc;

-- 92p.
-- Q2
select
    distinct job
from emp;

-- Q3
select *
from emp
order by deptno desc, ename asc;

select * from emp
where deptno = 20;

select * from emp
where empno = 7782;

select * from emp
where
    deptno = 30 and job = 'SALESMAN';

select * from emp
where
    deptno = 20 or job = 'CLERK';
    
select * from emp
where
    empno = 7499 and deptno = 30;

select * from emp
where
    deptno = 20 or job = 'SALESMAN';

select * from emp
where
    ename = 'WARD'
    OR job = 'CLERK'
    OR deptno = 20;

select * from emp
where
    (ename = 'WARD' OR job = 'CLERK') AND deptno = 20;

select * from emp
where 1 = 1; 

select * from emp
where sal >= 3000;

select * from emp
where sal <= 2000
order by sal;

select * from emp
where
    sal >= 2500 
    and job = 'ANALYST';



