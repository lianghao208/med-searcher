/**
 * Created by Administrator on 2017/11/21.
 */
function getMedTable(id) {
    var request = new XMLHttpRequest();
    request.open("GET", "/search/getMedById?id="+id);
    request.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    //TODO 补全代码
    request.send();
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var responseObj = request.response;//得到json数组字符串
                var jsObj = JSON.parse(responseObj);//转换成json数组对象
                insertRowToTable(jsObj[0]);//每个数据项创建一个块
            }
        } else {

        }
    }
}


function insertRowToTable(jsonObj) {
    var tb = document.getElementById("resultTableId");
    var tr = tb.insertRow(tb.rows.length);
    tr.style.background = "white";
    //tr.style.borderStyle = "1px double #1a237e";
    //tr.style.fontSize = "20px";
    var tdId = tr.insertCell();
    var tdColdHot = tr.insertCell();
    var tdSweat = tr.insertCell();
    var tdPain = tr.insertCell();
    var tdMedName = tr.insertCell();
    var tdIngredients = tr.insertCell();
    var tdResult = tr.insertCell();
    var tdSubmit = tr.insertCell();
    tdId.setAttribute("style","border: 1px double #1a237e;font-size: 20px;");
    tdColdHot.setAttribute("style","border: 1px double #1a237e;font-size: 20px;");
    tdSweat.setAttribute("style","border: 1px double #1a237e;font-size: 20px;");
    tdPain.setAttribute("style","border: 1px double #1a237e;font-size: 20px;");
    tdMedName.setAttribute("style","border: 1px double #1a237e;font-size: 20px;");
    tdIngredients.setAttribute("style","border: 1px double #1a237e;font-size: 20px;width=1000px");
    tdResult.setAttribute("style","border: 1px double #1a237e;font-size: 20px;");
    tdSubmit.setAttribute("style","border: 1px double #1a237e;font-size: 20px;");

    tdId.innerHTML=jsonObj.id;
    tdColdHot.innerHTML="<input width='100%' id='cold_hot_id' name='coldHot' type='text' value=" + jsonObj.coldHot + " >";
    tdSweat.innerHTML="<input width='100%' id='sweat_id' name='sweat' type='text' value=" + jsonObj.sweat + " >";
    tdPain.innerHTML="<input width='100%' id='pain_id' name='pain' type='text' value=" + jsonObj.pain + " >";
    tdMedName.innerHTML="<input width='100%' id='med_name_id' name='medName' type='text' value=" + jsonObj.medName + " >";
    tdIngredients.innerHTML="<input width='100%' id='ingredients_id' name='ingredients' type='text' value=" + jsonObj.ingredients + " >";
    tdResult.innerHTML="<input width='100%' id='result_id' name='result' type='text' value=" + jsonObj.result + " >";
    tdSubmit.innerHTML="<input id = "+ jsonObj.id + "update"+" name="+jsonObj.id+" value='提交修改' type='button' onclick='submitUpdate(name)'/>";
}

function submitUpdate(name) {
    var request = new XMLHttpRequest();
    var cold_hot = $("#cold_hot_id").val();
    var sweat = $("#sweat_id").val();
    var pain = $("#pain_id").val();
    var med_name = $("#med_name_id").val();
    var ingredients = $("#ingredients_id").val();
    var result = $("#result_id").val();
    if (cold_hot ==null) cold_hot=" ";
    if (sweat ==null) sweat=" ";
    if (pain ==null) pain=" ";
    if (med_name ==null) med_name=" ";
    if (ingredients ==null) ingredients=" ";
    if (result ==null) result=" ";
    if(cold_hot == " " &&
        sweat==" " &&
        pain==" " &&
        appetite==" "
    ){
        alert("数据不可为空！");//选项框为空，则数据为用户输入的字符串
    }
    request.open("POST", "/search/updateResult");
    request.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    request.send("id="+name + "&" +
        "cold_hot="+document.getElementById("cold_hot_id").value + "&" +
        "sweat="+document.getElementById("sweat_id").value + "&" +
        "pain="+document.getElementById("pain_id").value + "&" +
        "appetite=" + "&" +
        "pee="  + "&" +
        "defecate="  + "&" +
        "appearance=" + "&" +
        "lady="  + "&" +
        "thirsty=" + "&" +
        "energy="  + "&" +
        "sleep=" + "&" +
        "pulse=" + "&" +
        "others=" + "&" +
        "med_name=" +document.getElementById("med_name_id").value + "&" +
        "ingredients=" +document.getElementById("ingredients_id").value + "&" +
        "result="+document.getElementById("result_id").value);
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                alert("修改药方成功！");
            } else {
                alert("error");
            }

        }
    }
}

function getParam(){
    var query = location.search.substring(1);
    var values= query.split("&");
    //************my***********
    var value = new Array(values.length);
    //************************
    var pos = values[0].indexOf('=');
    var paramname = values[0].substring(0,pos);
    var id = values[0].substring(pos+1);
    console.log(paramname+":"+id);
    getMedTable(id);
}

//提交检测
$(document).ready(function(){
    getParam();

});
