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

-- 봉급이 2000 이상이고 3000 미만인 사원 출력
select * from emp
where
    sal >= 2000 and sal < 3000;

select * from emp
where
    2000 <= sal and 3000 > sal;

/* 
-- 문법에 어긋남 
select * from emp
where
    2000 <= sal < 3000;
*/

-- 같다 =
-- 다르다 != 또는 <> 또는 ^=
select * from emp
where
--    sal != 3000;
--    sal <> 3000;
    sal ^= 3000;

-- 글씨는 같다가 없다
select * from emp where ename >= 'C';

-- 문제1. 부서번호가 20이 아닌 목록
select * from emp
where
    deptno != 20;
-- 문제2. 부서번호가 20도 아니고 10도 아닌 목록
select * from emp
where
    deptno != 20 and deptno <> 10;
-- 문제3. 부서번호가 30이면서 봉급 2000 이하
select * from emp
where
    deptno = 30 and sal <= 2000;

select * from emp
where
    not sal = 3000;
    -- sal <> 3000

-- 2000 미만 또는 3000 이상 출력
select * from emp
where
    sal < 2000 or sal >= 3000;
    
-- 2000 이상 그리고 3000 미만 이 아닌것
select * from emp
where
   not (sal >= 2000 and sal < 3000);

select * from emp
where
    job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';

select * from emp
where
    job in ('MANAGER', 'SALESMAN', 'CLERK');


select * from emp
where
    not (job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK');
    --  job != 'MANAGER' and...

select * from emp
where
    job not in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where
    deptno in (10, 20);

select * from emp
where
    deptno not in (10, 20);

select * from emp
where
    sal between 2000 and 3000;
    -- sal >= 2000 and sal <= 3000

select * from emp
where
    sal not between 2000 and 3000;

-- %는 길이에 관계없이 아무거나
select * from emp
where
    ename like 'S%';

-- 시작, 끝, 중간에 관계없이 A를 포함한 모든 것
select * from emp
where
    ename like '%A%';

-- _는 어떤 글씨든 딱 한글자
select * from emp
where
    ename like '_L%';

select * from emp
where
    mgr like '77%';

select * from emp
where
    ename not like '____';

select * from emp
where ename = 'A_     A';

select * from emp
where ename like 'A\_%A' escape '\';

-- null은 제외된다
select * from emp
where comm <= 400;

-- null 조회가 안된다
select * from emp
where comm = null;

select * from emp
where comm is null;

select * from emp
where comm is not null;

select comm, comm + 10 from emp;

select * from emp where mgr is null;

select * from emp
where deptno = 10
union
select * from emp
where deptno = 20;

-- 컬럼의 개수가 달라서 오류
select empno, ename, sal, deptno
from emp where deptno = 10
union
select empno, ename, sal
from emp where deptno = 20;

select empno, ename, sal, deptno
from emp where deptno = 10
union
select empno, ename, sal, deptno
from emp where deptno = 20;

-- empno와 ename의 위치를 바꿈
-- 숫자, 문자
select empno, ename, sal, deptno
from emp where deptno = 10
union
select ename, empno, sal, deptno
from emp where deptno = 20;

-- 타입이 같으면 OK
-- 컬럼의 의미는 신경쓰지 않는다
select empno, ename, sal, deptno
from emp where deptno = 10
union
select sal, ename, sal, deptno
from emp where deptno = 20;

/* union */
-- 한줄의 모든 내용이 중복되는 경우가 있으면 
-- 중복을 제거하고 출력
select empno, ename, sal, deptno
from emp where deptno = 10
union
select empno, ename, sal, deptno
from emp where deptno = 10;

/* union all */
-- 중복에 관계없이 모든 줄을 표시
select empno, ename, sal, deptno
from emp where deptno = 10
union all
select empno, ename, sal, deptno
from emp where deptno = 10;


-- Q1
select * from emp where ename like '%S';
-- Q2
select
    empno, ename, job, sal, deptno
from 
    emp
where
    deptno = 30
    and job = 'SALESMAN';
-- Q3
select
    empno, ename, job, sal, deptno
from emp
where
    deptno in (20, 30)
    and sal > 2000;
-- Q3: union all
select
    empno, ename, job, sal, deptno
from emp
where
    sal > 2000
    and deptno = 20
union all
select
    empno, ename, job, sal, deptno
from emp
where
    sal > 2000
    and deptno = 30;

select * from emp
where deptno in (20, 30)
intersect
select * from emp
where sal > 2000;

-- Q4
select * from emp
where 
   not (2000 <= sal and 3000 >= sal);
--   2000 > sal or 3000 < sal;
-- Q5
select
    ename, empno, sal, deptno
from emp
where
    ename like '%E%'
    and deptno = 30
    and sal not between 1000 and 2000;
-- Q6
select * from emp
where
    comm is null
    and mgr is not null
    and job in ('MANAGER', 'CLERK')
    and ename not like '_L%';

select * from emp
where mgr like '%';

select * from dual;


select upper('abcDe') 
from dual;

select lower('abcDe') 
from dual;

select lower(ename) from emp;
select upper(ename) from emp;

select upper( lower(ename) ) from emp;

-- 대소문자 구분없이 검색
select * from emp
where
    ename like '%A%' or ename like '%a%';

/* AB Ab aB ab */
-- upper, lower는 대소문자 구분 없이 like 검색할때 딱 좋다
select * from emp
where
    upper(ename) like upper('%Mi%');

-- length : 문자 개수
select ename, length(ename) from emp;

select length('abc'), length('한글') from dual;

select ename, length(ename) from emp
where length(ename) >= 5;

select length('한'), lengthb('한') from dual;

-- substr
-- substr(글씨, 시작 위치, 몇개)
-- substr(글씨, 시작 위치) : 시작 위치부터 끝까지
select 
    '123456', 
    substr('123456', 3, 2), -- '34'
    substr('123456', 2, 3) -- '234'
from dual;

select
    job,
    substr(job, 1, 2), substr(job, 0, 2),  -- 앞에 두글자만 출력
    substr(job, 3, 3),
    substr(job, 4), -- 4번째 부터 끝까지
    substr(job, 4, 100),
    substr(job, 44, 100), -- 실제 길이보다 시작위치가 큰 경우 null
    length(  substr(job, 4)  ),
    substr(job, -3, 2),
    substr(job, -3)-- 맨 뒤 3글자만 출력. 즉, 뒤에서 3번째에서 시작하고 끝까지
from emp;

select substr(1234, 2) from dual;

select
    '010-2046-7051',
    replace('010-2046-7051', '-', ' '),  -- 글씨에서 두번째 값을 모두 찾아서 세번째로 바꿔준다
    replace('010-2046-7051', '-') -- 세번째가 생략된 경우 없애준다
    , replace('010-2046-7051', '-', '**')
from dual;

--👼
select replace(ename, 'A', '👼') from emp;
-- SMITH
-- 문제1 : ename에서 앞에 두글자만 출력 ; 'SM'
-- 문제2-0 : ename에서 A만 *로 처리
-- 문제2 : ename에서 앞에 두글자만 *로 처리 ; '**ITH'
-- 문제3-0 : ename의 반절에 해당하는 길이를 출력
-- 문제3-1 : ename의 앞에 반절 모두 *로 처리 '*NER', '*TH', '*ITH'
-- 문제3-2 : ename의 뒤의 반절 모두 *로 처리 'TUR*'
select
    ename,
    substr(ename, 1, 2) as "앞에 두글자",
    replace(ename, substr(ename, 1, 2), '**') as "2",
    length(ename) / 2 as "3-0",
    /* 변환해야 하니까 replace
        replace 첫번째 : ename
        두번째 : 절반에 해당하는 글씨 모두 확보
            substr써보자
            첫번째 : ename
            두번째(시작위치) : 처음부터니까 1
            세번째(자를 개수) : length(ename) / 2
        세번째 : '*'
    */
    replace(
        ename,
        substr(ename, 1, length(ename) / 2),
        '*') as "3-1",
    replace(
        ename,
        substr(ename, (length(ename) / 2) + 1 ),
        '*') as "3-2"
from emp;

select 
    'Oracle',
    lpad('Oracle', 10, '#'),
    rpad('Oracle', 10, '*'),
    lpad('Oracle', 10),
    rpad('Oracle', 10),
    lpad('Oracle', 3),
    rpad('Oracle', 3)
from dual;

select
    rpad('971225-', 14, '*'),
    rpad('010-2046-', 13, '*')
from dual;

select
    ename,
    rpad(ename, 6, '*'),
    lpad(ename, length(ename)*2, '*')
from emp;
-- 이름을 6자리로 만들고 빈 공간의 오른쪽을 *로 채운다

-- 문제1 : 전화번호 뒤 4자리를 *로 바꾸자. 단, replace 쓰지 말고
select 
    '010-2046-7051',
    -- 뒤 4자리를 *로 바꾸자. 단, replace 쓰지 말고
    -- 전체 자리수 파악, 4개를 제외한 글씨 파악, 조합해서 문제 해결
    length('010-2046-7051') as 자리수,
    substr('010-2046-7051', 1, length('010-2046-7051')-4) as "잘린 글씨",
    rpad(
        substr('010-2046-7051', 1, length('010-2046-7051')-4),
        length('010-2046-7051'),
        '*'
    )    
from dual;

-- 문제2 : 사원의 이름을 앞에 두글자만 보이게하고 나머지 *로 표시. 단, replace 쓰지 말고
/*
    두글자는 보이게
    나머지 *로 보이게
        *로 보일 개수를 지정
    원래 글씨의 길이만큼 보여줄껀데 두글자 빼고 나머지는 *로 채운다
    rpad( 첫두글자, 전체길이, * )
*/
select 
    ename,
    rpad(
        substr(ename, 1, 2),
        length(ename),
        '*'
    )
from emp;

-- 문제3 : 사원 이름의 앞글자 하나만 *로 표시. 단, replace 쓰지 말고
/*
    앞글자 하나 : 두번째부터 끝까지의 글씨를 살린다
    lpad( 두번째부터 끝까지, 전체길이, * )
*/
select 
    ename,
    lpad(
        substr(ename, 2),
        length(ename),
        '*'
    )
from emp;

-- 심화1 : job을 대상으로 20자크기의 공간에서 가운데 정렬
/*
    가운데 정렬 : 앞과 뒤에 동일한 공간이 있는거
    ********************
    ********WARD********
    20-6=14/2=7
    *******MARTIN#######
    *******MARTIN
    *******MARTIN#######
    
    lpad(
        job,
        (20-length(job)) / 2,
        '*'
    )
*/
select
    job,
    (20-length(job)) / 2,
    lpad(
        job,
        ( (20-length(job)) / 2 ) + length(job), -- *의 개수 + job 개수
        '*'
    ),
    rpad(
        lpad(
            job,
            ( (20-length(job)) / 2 ) + length(job), -- *의 개수 + job 개수
            '*'
        ),
        20,
        '*'
    )
from emp;

-- 다른방법 제보
select
lpad (
        substr(job, 0, length(job)/2), 
        10, 
        '*'
    ) as "왼쪽",
    rpad(
        substr(job, length(job)/2+1), 
        10, 
        '*'
    ) "오른쪽",
rpad(
    lpad (
        substr(job, 0, length(job)/2), 
        10, 
        '*'
    ), 
    20,
    rpad(
        substr(job, length(job)/2+1), 
        10, 
        '*'
    )
)
from emp;

select empno, ename, concat(empno, ename)
from emp;

select empno || ' : ' || ename from emp;

-- 내볼까 했던 문제
-- ename에 두번째 글자만 *처리

-- trim : 앞뒤 공백문자 제거. 단, 글씨 사이의 공백은 제거하지 않음
select
    '   a b  cd        ',
    trim('   a b  cd        ')
from dual;

select
    round(14.46),       -- 두번째 값이 없는 경우 소수점 첫째자리 반올림
    round(14.46, 1),    -- 두번째 값은 소수점 몇번째까지 표시할지 
    round(14.46, -1)    -- 두번째 값이 음수인 경우 정수로 거슬러 올라감
from dual;

select
    trunc(14.46),
    trunc(14.46, 1),
    trunc(14.46, -1),
    trunc(-14.46)
from dual;

select
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14)
from dual;

select
    mod(159687464, 6)
from dual;

-- 지금 오라클이 설치된 pc의 시간이 나온다
-- 설정에 따라 기본 출력값이 날짜의 일부만 나올 수도 있다
-- 강사 pc의 오라클은 9시간 차이 남(GMT 기준)
select
    sysdate,
    sysdate + 1, 
    sysdate - 1
from dual;

select
    hiredate,
    add_months(hiredate, 120)
from emp;

-- 컬럼에 +를 적으면 모두 숫자로 변경해서 적용
select empno, empno + '500' from emp;

-- ||를 적으면 모두 문자로 변경해서 적용
select empno, empno || 500 from emp;


select to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss') from dual;
select to_char(sysdate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"') from dual;
select sysdate, to_char(sysdate, 'yy/mm/dd') from dual;

select to_date('2024/11/15', 'yyyy/mm/dd') from dual;

select to_char(
            to_date('2024/11/15 15:55', 'yyyy/mm/dd hh24:ss'), 
            'yyyy-mm-dd hh24:mi:ss') 
from dual;


select 
    to_date('2025-05-02', 'yyyy-mm-dd') - to_date('2024/11/15', 'yyyy/mm/dd')
from dual;

select * from emp
where hiredate > to_date('1981/06/01', 'yyyy/mm/dd');

select
    comm, sal,
    comm+sal,
    nvl(comm, 0),
    nvl(comm, 0) + sal
from emp;

select
    comm,
    nvl2(comm, '널 아님', '널')
from emp;

select job, sal,
    decode(job,
        'MANAGER', sal * 1.1,
        'SALESMAN', sal * 1.05,
        'ANALYST', sal,
        sal * 1.03)
from emp;

-- 이름, 봉급, 성과금, 봉급+성과금(decode로)
select
    ename, sal, comm,
    sal+comm,
    sal + nvl(comm, 0),
    sal + decode(comm,
                null, 0,
                comm)
from emp;

select
    case job
        when 'MANAGER' then sal * 1.1
        when 'SALESMAN' then sal * 1.05
        when 'ANALYST' then sal
        else sal * 1.03
    end upsal
from emp;

select
    case
        when comm is null then '해당 없음'
        when comm = 0 then '수당 없음'
        when comm > 0 then '수당: '||comm
    end
from emp;

-- comm이 null인 경우 'N/A' 출력
-- null이 아닌 경우 comm 출력
select
    case
        when comm is null then 'N/A'
        --when comm is not null then '*' || comm
        else '' || comm
    end 
from emp;

-- Q2
select empno, ename, sal,
    trunc(sal/21.5, 2) day_pay,
    round((sal/21.5)/8, 1) time_pay
from emp;

-- Q4
select empno, ename, mgr,
    case
        when mgr is null then '0000'
        else
            case
                when substr(mgr, 1, 2) = '75' then '5555'
                when substr(mgr, 1, 2) = '76' then '6666'
                when substr(mgr, 1, 2) = '77' then '7777'
                when substr(mgr, 1, 2) = '78' then '8888'
--                else to_char(mgr)
                else '' || mgr
            end
    end chg_mgr1,
    /* in을 사용해서 간단하게 코딩 */
    /* 두번째 mgr이 5,6,7,8 일때 처리 */
    case
        when mgr is null then '0000'
        when substr(mgr, 2, 1) in ('5', '6', '7', '8')
--            then trim(lpad(' ', 5, substr(mgr, 2, 1)))
--            then lpad(substr(mgr, 2, 1), 4, substr(mgr, 2, 1))
            then lpad(substr(mgr, 2, 1), length(mgr), substr(mgr, 2, 1))
        else '' || mgr
    end chg_mgr2,
    case
        when mgr is null then '0000'
        when mgr like '75%' then '5555'
        when mgr like '76%' then '6666'
        when mgr like '77%' then '7777'
        when mgr like '78%' then '8888'
        else '' || mgr
    end chg_mgr3,
    case
        when mgr is null then '0000'
        else
            case substr(mgr, 1, 2)
                when '75' then '5555'
                when '76' then '6666'
                when '77' then '7777'
                when '78' then '8888'
                else '' || mgr
            end
    end chg_mgr4,
    case substr(mgr, 1, 2)
        when '75' then '5555'
        when '76' then '6666'
        when '77' then '7777'
        when '78' then '8888'
        else nvl(to_char(mgr), '0000')
    end chg_mgr5,
    case
        when mgr >= 7500 and mgr < 7600 then '5555'
    end chg_mgr6
from emp;

select sum(comm) from emp;
select sum(sal) from emp;
select sum(sal + nvl(comm, 0)) from emp;

-- count도 sum처럼 null은 제외함
-- count에는 *를 많이 씀
select count(*), count(sal), count(comm) from emp;

-- 다중행 함수는 다중행 함수끼리만 출력해야 한다
select count(*), sum(sal)/*, sal*/ from emp;

select count(*) from emp
where deptno = 30
and comm is not null;

select max(sal), max(ename), min(sal), min(hiredate), min(comm) from emp;
-- 이름에 A가 포함된 사람의 수는?
select count(*) from emp
where ename like '%A%';

select * from emp
where ename like '%A%';

-- 최대 연봉을 받는 사람의 모든 정보 표시
select max(sal) from emp;
select * from emp;

-- where에서 다중행 함수(집계 함수)를 사용할 수 없음
/*
select * from emp
where sal = max(sal) ;
*/

select avg(sal) from emp;


/*
-- count(*) 등 집계함수는 where에서 사용할 수 없다
select *
from emp
where count(*) > 2;
-- where sal > avg(sal);
*/

select '10', sum(sal), avg(sal) from emp where deptno = 10
union all
select '20', sum(sal), avg(sal) from emp where deptno = 20
union all
select '30', sum(sal), avg(sal) from emp where deptno = 30;

select deptno, avg(sal), sum(sal), count(*)
from emp
group by deptno
order by deptno;

select deptno, job, avg(sal), sum(sal), count(*)
from emp
group by deptno, job
order by deptno, job;

select deptno, job, avg(sal), sum(sal), count(*)
from emp
group by deptno, job
having avg(sal) >= 2000
order by deptno, job;

select deptno, job, avg(sal), sum(sal), count(*)
from emp
group by deptno, job
having deptno = 20
order by deptno, job;

/*
having : group by에서만 사용
where에서 표현할 수 있는건 가급적 where에서 사용하는게 좋다
집계함수를 조건으로 주고 싶을때 사용한다
*/

-- 순서
/* 5 */ select job, count(*) as cnt
/* 1 */ from emp
/* 2 */ where sal > 1000 /*and cnt > 3*/
/* 3 */ group by job
/* 4 */ having count(*) >= 3
/* 6 */ order by cnt desc;

-- 194p. 1분복습
select deptno, job, avg(sal)
from emp
where deptno = 10
group by deptno, job
having avg(sal) >= 500
order by deptno, job;

-- 212p.
-- Q1
select
    deptno, floor(avg(sal)) avg_sal, max(sal) max_sal, min(sal) min_sal, count(*) cnt
from emp
group by deptno;
-- Q2
select
    job, count(*)
from emp
group by job
having count(*) >= 3;

-- 하지만 어순을 지키는게 좋겠다
select job, count(*)
from emp
having count(*) >=3
group by job;

/* 추가문제1
    1981년에 입사한 사원 중에서 
    급여가 가장 낮은 사원의 급여를 조회하세요
*/
select min(sal) from emp
where
    hiredate >= to_date('1981-01-01', 'yyyy-mm-dd')
    and hiredate <= to_date('1981-12-31', 'yyyy-mm-dd')
    
    or to_char(hiredate, 'yyyy') = '1981'

    or hiredate like '%81%';
    
/* 추가문제2
    각 부서별로 급여가 
    가장 높은 사원과 가장 낮은 사원의 급여 차이를 조회하세요.
*/
select
    deptno, max(sal) - min(sal)
from emp
group by deptno;


