window.addEventListener("load",abc);
function calculateResult(){
    const expression=document.querySelector("#box-1").value;
    const result=eval(expression);
    document.querySelector("#box-1").value=result;


}
function appendToInput(value){
    document.querySelector("#box-1").value+=value;

}
function removeElement(){
    const removed=document.querySelector("#box-1");
    removed.value = removed.value.slice(0,-1);
    
}
function clearInput(){
    document.querySelector("#box-1").value='';
    
}

