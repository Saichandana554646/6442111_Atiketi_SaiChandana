const events = [
  { name: "Yoga", date: "2025-07-01", category: "health" }
];
function logEvent({ name, date }) {
  console.log(`${name} on ${date}`);
}
const newList = [...events]; // Spread
logEvent(events[0]);
