const eventList = document.querySelector("#eventList");
function renderEvent(event) {
  const div = document.createElement("div");
  div.className = "eventCard";
  div.textContent = `${event.name} - ${event.date}`;
  eventList.appendChild(div);
}
