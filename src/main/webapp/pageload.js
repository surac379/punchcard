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
        let id = document.createElement('td');
        id.innerText = timesheet.weekendingDate;
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
        tr.appendChild(id);
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
            editor.innerText = timesheet.sun_hrs;
            tr.appendChild(editor);
        }

        document.getElementById('list').appendChild(tr);




    }


})



