function sendRegistration(data) {
  document.getElementById("status").textContent = "Submitting...";
  setTimeout(() => {
    fetch("https://mockapi.io/register", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(res => {
      document.getElementById("status").textContent = "Registered successfully!";
    })
    .catch(() => {
      document.getElementById("status").textContent = "Failed to register.";
    });
  }, 2000);
}
