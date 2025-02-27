console.log("hello world");

var a =10; // 자바와 비교
console.log("a : " + a); // + : 문자로 변경

b = 11;
console.log("b : " , b); // , : 띄어쓰기
// console.log  - println(console.log창에만 표시)

let c = 12;
console.log(c);

const d = 13;
console.error(d);

let e;
console.log(e); //undefined 허용 : 값이 없는 상태 출력
console.log("" + e); // undefined 출력

// console.log(f); //error
// console.log("hello");

// var를 안쓰면 지역변수 개념이 사라짐
// var는 둘 다 된다
var a = 20;
b = 21;      
console.log(a, b); // 재선언 가능 (var, 안쓴것)

c = 22;
console.log(c);

// d = 23; // error : const는 상수 . 둘 다 안됨
// let은 변수 재선언은 안되고 재할당은 됨


c = "문자"
c = '<a href="naver.com">';
c = "문\"자"
c = "문\n자"
console.log(c);

console.log(typeof c, c); // 타입 알려줌
c = 13;
console.log(c == d); // 값이 같은가??
console.log(c === d); // 값과 타입까지 같은가??

let a1, 
    a2,
    a3;
    if(a1 === undefined){
        console.log("a1의 값을 넣으세요", typeof a1)
    }
    if(typeof a1 == "undefined") {

    }

    const g = "12.34";
    console.log(1, g+5); 
    console.log(2, Number(g)+5); // 소숫점 ㅇ
    console.log(2, ParseInt(g)+5); // 소숫점 X

    const h = "문자";
    console.log(h*5); // NaN : Not a Number

    console.log(5 / 0);
    console.log( isFinite(5/0) );

    alert("alert\n글씨");
    const result1 = confirm("진짜? 할거?");
    console.log(result1)
    const result2 = prompt("메시지\n다음줄");
    console.log(result2);
    
    console.log("이전");
    alert("alert\n글씨"); // alert 나오면 멈춤
    console.log("이후");

    console.log(`입력한 글씨는 ${result2}입니다`);