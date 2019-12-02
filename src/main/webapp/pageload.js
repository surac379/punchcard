document.addEventListener('DOMContentLoaded', function () {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'http://localhost:8080/punchcard/servlet');
    xhr.onreadystatechange = function () {
        console.log(xhr.readyState);
        if (xhr.readyState === 4 && xhr.status === 200) {
            var json = JSON.parse(xhr.responseText);
            console.log(json);
            LoadTimesheets(json);

        }
    }
    xhr.send();

    function LoadTimesheets(list) {
        for (let timesheet of list) {
            apendTimesheet(timesheet);
        }
    }
    function apendTimesheet(timesheet) {
        let tr = document.createElement('tr');
        let tdate = document.createElement('td');
        tdate.innerText = timesheet.weekendingDate;
        let mon = document.createElement('td');
        mon.innerText = timesheet.mon_hrs;
        let tue = document.createElement('td');
        tue.innerText = timesheet.tues_hrs;
        let wed = document.createElement('td');
        wed.innerText = timesheet.wed_hrs;
        let thu = document.createElement('td');
        thu.innerText = timesheet.thurs_hrs;
        let fri = document.createElement('td');
        fri.innerText = timesheet.fri_hrs;
        let sat = document.createElement('td');
        sat.innerText = timesheet.sat_hrs;
        let sun = document.createElement('td');
        sun.innerText = timesheet.sun_hrs;
        let status = document.createElement('td');
        status.innerText = timesheet.status;
        tr.appendChild(tdate);
        tr.appendChild(mon);
        tr.appendChild(tue);
        tr.appendChild(wed);
        tr.appendChild(thu);
        tr.appendChild(fri);
        tr.appendChild(sat);
        tr.appendChild(sun);
        tr.appendChild(status);
        
        if (timesheet.status == "Saved") {
            let editor = document.createElement('td');
            let editBtn = document.createElement('BUTTON');
            //editBtn.type = "Button";
            editBtn.innerHTML = "Edit";     
            
            editor.appendChild(editBtn);            
            
            tr.appendChild(editor);
        }

        document.getElementById('list').appendChild(tr);

    }

})

document.getElementById('newItem').addEventListener('click',function(){
    let tr = document.createElement('tr');
    tr.id = "newTimesheetRow";
    
    let tdate = document.createElement('td');
    let dte = document.createElement('input');
    dte.name = 'dateNew';
    dte.id = 'dateNew';
    dte.type = 'date';
    tdate.append(dte);

    let mon = document.createElement('td');
    let monl = document.createElement('input');
    monl.name = 'monNew';
    monl.type = 'number';
    mon.appendChild(monl);

    let tue = document.createElement('td');
    let tuel = document.createElement('input');
    tuel.name = 'tueNew';
    tuel.type = 'number';
    tue.appendChild(tuel);

    let wed = document.createElement('td');
    let wedl = document.createElement('input');
    wedl.name = 'wedNew';
    wedl.type = 'number';
    wed.appendChild(wedl);

    let thu = document.createElement('td');
    let thul = document.createElement('input');
    thul.name = 'thuNew';
    thul.type = 'number';
    thu.appendChild(thul);

    let fri = document.createElement('td');
    let fril = document.createElement('input');
    fril.name = 'friNew';
    fril.type = 'number';
    fri.appendChild(fril);

    let sat = document.createElement('td');
    let satl = document.createElement('input');
    satl.name = 'satNew';
    satl.type = 'number';
    sat.appendChild(satl);

    let sun = document.createElement('td');
    let sunl = document.createElement('input');
    sunl.name = 'sunNew';
    sunl.type = 'number';
    sun.appendChild(sunl);

    let none = document.createElement('td');
    let addnew = document.createElement('BUTTON');
    addnew.innerHTML = 'Save';
    addnew.setAttribute('id','addNew');
    
    let submitCell = document.createElement('td');
    let Submitnew = document.createElement('BUTTON');
    Submitnew.innerHTML = 'Submit';
    Submitnew.setAttribute('id','Submitnew');
    
    let sbmt = document.createElement('td'); 
    
    tr.appendChild(tdate);
    tr.appendChild(mon);
    tr.appendChild(tue);
    tr.appendChild(wed);
    tr.appendChild(thu);
    tr.appendChild(fri);
    tr.appendChild(sat);
    tr.appendChild(sun);
    
    none.appendChild(addnew);
    tr.appendChild(none);
    
    submitCell.appendChild(Submitnew);
    tr.appendChild(submitCell);      
    document.getElementById('list').appendChild(tr);

})

// document.addEventListener('click',function(e){
//     if (e.target && e.target.id == 'addNew')
//     {  
//     e.preventDefault();
//     let x = document.cookie;
//     let url = 'http://localhost:8080/punchcard/servlet';
//     let promise = axios.get(url);
//     promise.then(function(response){
//         console.log(x);
         
//        document.getElementById("newTimesheetRow").style.display = "none";
        
//     } 
     
//     )} 

// })
