export function fillDepartmentTable() {
   const departmentSearchBar = document.getElementById("departmentSearch");

   // Dynamic Search bar on Keyup event
   departmentSearchBar.addEventListener("keyup", () => {
      const searchKeyword = departmentSearchBar.value.trim();
      fetchDepartments(searchKeyword);
   });

   // Fetch departments with url
   function fetchDepartments(searchKeyword) {
      const url = new URL("http://localhost:8080/api/employee/count");

      if (searchKeyword) {
         url.searchParams.append("name", searchParams.name);
      }

      fetch(url)
         .then((response) => response.json())
         .then((departments) => {
            displayDepartments(departments);
         })
         .catch((error) =>
            console.error("Error Fetching departments: ", error)
         );
   }

   // Display Fetched data in table
   function displayDepartments(departments) {
      const table = document.getElementById("departmentTbl");
      table.innerHTML = "";
      departments.forEach((deparment) => {
         const row = `
                     <tr>
                     <td>${deparment.id}</td>
                     <td>${deparment.departmentName}</td>
                     <td>${deparment.employeeCount}</td>
                     <td>
                        <button class="btn btn-success" data-bs-toggle="modal" data-bs-target="#departmentModal" data-action="edit" data-id=${deparment.id}><i class="bi bi-pencil-square"></i></button>
                        <button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#departmentDeleteConfirmationModal" data-id=${deparment.id}><i class="bi bi-trash"></i></button>
                     </td>
                     </tr>
                  `;
         table.innerHTML += row;
      });
   }

   fetchDepartments();
}
