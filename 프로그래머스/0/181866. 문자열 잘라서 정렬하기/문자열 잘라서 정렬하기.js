function solution(myString) {
    var answer = [];
    let data = "";
     for (let i = 0; i < myString.length; i++) {
        if (myString[i] === "x") {
            if (data !== "") { 
                answer.push(data);
                data = "";
            }
        } else {
            data += myString[i];
        }
    }

    // 마지막 남은 data 처리
    if (data !== "") {
        answer.push(data);
    }
    return answer.sort();
}