document.getElementById("registerBtn").onclick = function () {
  alert("You registered!");
};
document.getElementById("categoryFilter").onchange = function (e) {
  filterEvents(e.target.value);
};
document.getElementById("searchInput").addEventListener("keydown", function (e) {
  if (e.key === "Enter") {
    console.log("Searching for:", e.target.value);
  }
});
