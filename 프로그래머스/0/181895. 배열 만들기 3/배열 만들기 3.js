function solution(arr, intervals) {
    var answer = [];
   
    for(let i =0; i < intervals.length; i++){
        for(let j = intervals[i][0]; j<intervals[i][1]+1; j++){
           answer.push(arr[j])
        }
    }
    return answer;
}