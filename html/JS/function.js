<<<<<<< HEAD
// fuction 키워드로 선언
// fuction 함수명(전달인자 변수명들)
// 전달인자에 타입 적지 않는다

// 함수를 쓰는 이유
// 정해진 순으로 동작하는 코드 묶음
// 재사용도 편하다

function plus(x, y) {
    let z = x + y;
    return z;
}


let a = plus(2, 3);
console.log("a :", a);

// 함수 선언과 동시에 실행
// (function test(){console.log("test")})();



function times2(x) {

    let z = plus(x,x);
    return z;
}

plus(8, 5)
plus(times2(4), 5)
// 자세히
let b = times2(4)
plus(b, 5)


console.log('---------------')
plus()
plus(1)
plus(1,2,3,5,6)

function plus2(x,y){

    if(x == undefined) {
       x = 0; // 검사
    }
}
plus2();


// 초기값 사용법
// 전달인자가 없는 경우 초기값 적용
function plus3(x = 5, y = 6) {
    console.log("x :", x)
    console.log("y :", y)
 return x + y;

}
console.log(plus(1,2));
console.log(plus3());

             // 몇 개 오던 다 받음
             // spread 연산자
             // 가변적인 전달인자를 받을 수 있다
function log(... obj) {
     console.log(typeof obj)
}
log(1,2,3)

let d = [100, 200];
console.log( plus(d[0], d[1]))
console.log( plus(...d))

let f = "console.log(123)";
eval(f) // string을 javascript로 변환

function plus4() {
    console.log("plus4 실행")
}

let p = plus4;
console.log(typeof p)
p();

//익명 함수
let times = function (a, b) {

    return a*b
}
console.log(times(3,4))
// 기존의 함수도 함수명을 변수 취급




         // 변수에 함수를 넣기
function pay( n, cb ) {

console.log("pay 실행")

let ramen = 2500;
let result = cb(ramen, n)
console.log("결과 :", result)
} 
pay(10, times);

// setTimeout : 첫 번째 전달인자 : 실행할 함수
//              두 번째 전달인자 : 지연할 시간 (1/1000)




let print5 = function() {
console.log("5초뒤");
}
setTimeout(print5, 5000);
setTimeout( function() {

    console.log("6초뒤");
}
, 6000 )




let c = 1;
let idx = setTimeout ( function(a,b) {

    console.log("a", a);
    console.log("b", b);
    console.log("c", c);

} , 6 * 1000, c, 20 )
console.log("idx :", idx)

// 예약 취소
=======
// fuction 키워드로 선언
// fuction 함수명(전달인자 변수명들)
// 전달인자에 타입 적지 않는다

// 함수를 쓰는 이유
// 정해진 순으로 동작하는 코드 묶음
// 재사용도 편하다

function plus(x, y) {
    let z = x + y;
    return z;
}


let a = plus(2, 3);
console.log("a :", a);

// 함수 선언과 동시에 실행
// (function test(){console.log("test")})();



function times2(x) {

    let z = plus(x,x);
    return z;
}

plus(8, 5)
plus(times2(4), 5)
// 자세히
let b = times2(4)
plus(b, 5)


console.log('---------------')
plus()
plus(1)
plus(1,2,3,5,6)

function plus2(x,y){

    if(x == undefined) {
       x = 0; // 검사
    }
}
plus2();


// 초기값 사용법
// 전달인자가 없는 경우 초기값 적용
function plus3(x = 5, y = 6) {
    console.log("x :", x)
    console.log("y :", y)
 return x + y;

}
console.log(plus(1,2));
console.log(plus3());

             // 몇 개 오던 다 받음
             // spread 연산자
             // 가변적인 전달인자를 받을 수 있다
function log(... obj) {
     console.log(typeof obj)
}
log(1,2,3)

let d = [100, 200];
console.log( plus(d[0], d[1]))
console.log( plus(...d))

let f = "console.log(123)";
eval(f) // string을 javascript로 변환

function plus4() {
    console.log("plus4 실행")
}

let p = plus4;
console.log(typeof p)
p();

//익명 함수
let times = function (a, b) {

    return a*b
}
console.log(times(3,4))
// 기존의 함수도 함수명을 변수 취급




         // 변수에 함수를 넣기
function pay( n, cb ) {

console.log("pay 실행")

let ramen = 2500;
let result = cb(ramen, n)
console.log("결과 :", result)
} 
pay(10, times);

// setTimeout : 첫 번째 전달인자 : 실행할 함수
//              두 번째 전달인자 : 지연할 시간 (1/1000)




let print5 = function() {
console.log("5초뒤");
}
setTimeout(print5, 5000);
setTimeout( function() {

    console.log("6초뒤");
}
, 6000 )




let c = 1;
let idx = setTimeout ( function(a,b) {

    console.log("a", a);
    console.log("b", b);
    console.log("c", c);

} , 6 * 1000, c, 20 )
console.log("idx :", idx)

// 예약 취소
>>>>>>> 8ed0b264f0ab0e7ed37b41d681732ec224cf14e5
clearTimeout(idx);