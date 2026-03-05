fetch("/contacts")
.then(response => response.json())
.then(data => {
    let rows = "";
    data.forEach(c => {
        rows += `
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.email}</td>
            <td>${c.message}</td>
        </tr>`;
    });
    document.getElementById("contactsTable").innerHTML = rows;
});
