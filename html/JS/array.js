// 배열은 변수의 집합
// 한번에 몽땅 만들어서 index로 관리할 수 있는 변수의 집합

// 배열 변수를 만드는 가장 쉬운 방법
let arr = [];
// 두번째 방법
let arr2 = new Array();

// 값을 미리 알고 있을 때
arr = [1,2,3];
arr = new Array(1,2,3);
console.log("arr[0]", arr[0]); // 1


arr[1] = 20;
console.log("arr[1]", arr[1]); // 20

arr[10] = 10;
console.log("arr", arr);
console.log("arr[20]", arr[20]); // undifined
// 자바 객체 : 클래스



arr["name"] = "이름";
console.log("arr", arr);
console.log(`arr["name"]`, arr["name"]); // 이름 (임의의 값)
console.log("arr.length", arr.length)



const str = "휴먼교육센터";
console.log("str[1]", str[1]); // 먼
console.log("str.length", str.length); //6


// arr = [휴, 먼, 교, 육, 센, 터];
for(let i=0; i<=str.length; i++) {
    console.log(str[i], i);
}


// for(let i=0; i<=arr.length; i++) {
//     console.log(arr[i]); 
// }







let 액션 = [`헬다이버2`, `엘든링`, `사펑`, `콜옵`];
let 롤플레잉 = [`발더3`, `호구와트`, `스토커2`];
let 전략 = [`발트로`, `토탈워`, `메타포`, `스텔라리스`];

let 스팀 = [액션, 롤플레잉, 전략];

for(let j=0; j<스팀.length; j++) {

    // console.log(스팀[j]);

    for(let i=0; i<스팀[j].length; i++) {

        console.log(스팀[j][i], j, i);
    }

}

// for(let i=0; i<액션.length; i++) {

//     console.log(액션[i]);
// }




// 배열의 초기화
arr = []; 
arr = [1,3,2,5,4,2];

//js에서 배열을 java의 ArrayList처럼 메소드 사용하기

//마지막에 하나 추가
// 자동으로 배열 크기도 증가
// java의 ArrayList의 add와 같음
arr.push(10);
console.log(arr);

// 맨 처음에 하나 추가
arr.unshift(11);
console.log(arr);

let pop = arr.pop();
console.log(arr);
console.log("pop : ", pop);

let shift = arr.shift();
console.log(arr);
console.log("shift : ", shift);

// 배열 순서 거꾸로
arr.reverse();
console.log(arr);

// 배열 정렬, 단 오름차순만 지원
arr.sort();
console.log(arr);

// [1, 2, 2, 3, 4 ,5]
// splice(시작 index, count)
// splice(시작 index)  
let splice = arr.splice(2, 3);
console.log("arr", arr);
console.log("splice", splice);

// 1, 2, 5
// 음수 index는 뒤에서부터
let splice2 = arr.splice[-2]
console.log("arr", arr);
console.log("splice2", splice2);

// let month = "12";
// let month2 = "1";

// month = "0" + month; // "012"
// month2 = "0"+ month2; //"01"

arr = [1,2,3,4,5];
// 1,2는 똑같이 동작하되 지운 자리에 3번째 전달인자 이후의 값을 넣음
let s = arr.splice(1,2, `둘`)
console.log(arr)
console.log(s)

let join = arr.join()
let join2 = arr.join(`-`)
console.log(arr)
console.log(join)
console.log(join2)

// 문자열 함수 split을 이용해서
// 전달인자의 문자로 잘라서 배열로 만들어 줌
// 단, 전달인자의 문자는 사라짐
let split = join2.split("-")
console.log(split)

arr = [1,2,3,4,5]
//slice (시작 index, 종료index)
// Ctrl + c 느낌
let slice = arr.slice(1,3);
console.log(arr)
console.log(slice)
console.log(concat)

console.log(arr.toString());
console.log(""+ arr);
