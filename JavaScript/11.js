document.getElementById("regForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const name = this.elements["name"].value;
  const email = this.elements["email"].value;
  const event = this.elements["event"].value;
  if (!name || !email) {
    document.getElementById("errorMsg").textContent = "All fields are required.";
    return;
  }
  console.log(`Registered ${name} for ${event}`);
});
