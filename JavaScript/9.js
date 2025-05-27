// Using Promises
fetch("https://mockapi.io/events")
  .then(res => res.json())
  .then(data => console.log("Events:", data))
  .catch(err => console.error(err));
// Using async/await
async function fetchEvents() {
  document.getElementById("loading").style.display = "block";
  try {
    const res = await fetch("https://mockapi.io/events");
    const data = await res.json();
    console.log(data);
  } catch (e) {
    console.error("Failed to load events", e);
  } finally {
    document.getElementById("loading").style.display = "none";
  }
}
