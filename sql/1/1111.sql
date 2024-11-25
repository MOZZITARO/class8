select EMPNO, ENAME, DEPTNO
from EMP;

SELECT 
    DISTINCT job, deptno
FROM EMP;

select 
     ename,
     sal,
     sal * 12 + comm "올해 연봉",
     comm
from emp;

select * from emp
order by sal;

select * from emp
order by job;

SELECT *
FROM EMP
WHERE EMPNO = 7782;

SELECT EMPNO "EMPLOYEE_NO", ENAME "EMPLOYEE_NAME", MGR "MANAGER", SAL "SALARY", COMM "COMMISION", DEPTNO "DEPARTMENT_NO"
FROM EMP
ORDER BY DEPTNO desc; ENAME;

SELECT DISTINCT JOB
FROM EMP;

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
and job = 'ANALYST'
