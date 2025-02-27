
// const num = -3;
// console.log (`입력한 글씨는 ${num} 입니다`)

const temp = prompt("온도를 입력하세요") // 입력한 문자열 반환
console.log(typeof temp, temp>0, )

if (temp <= 0){
    console.log("영하입니다")
} else {
    console.log("영상입니다")
}


// js에서의 참(true)는 거짓이 아닌것
// 거짓 : false, 0, null, undefined, NAN
// 참 : ! 거짓

if(temp > 1 && temp > 2 && temp > 3) {
    // && 거짓을 찾는 과정 || 거짓을 찾는 과정
}

let a = (temp > 0) ? "영상" : "영하";

// 1단계 : 4단 
// 2단계 : 구구단

let ii = 4;

// console.log(4 * 1 = 4)

for(j = 1; j<=9; j++) {
    
    console.log( ii+" * "+j+"=="+ (ii * j)) // 결과 출력X 문자 그대로 보존
    // console.log( i * j == i * j)
}




let i = 1;
while(i <= 10) {

    console.log(i)
    i++
}

let k = 1;
for(; k<=10 ;) {

    console.log(k)
    i++
} // for문과 while은 동일하다




console.log("----------------------")






// of 앞에 변수에 현재의 값을 저장
// java의 향상된 for문
// "name"에 해당하는 숫자가 아닌 index를 가지는건 가져오지 못한다
// 몇 번 째 반복중인지 알 수 없다
// of는 전통적인 for문으로 0부터 length 이전까지 반복
let cnt = 0;
for(let obj of arr) {

    console.log('obj :', obj, cnt);
    cnt++;
}

