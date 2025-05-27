const events = [
  { name: "Music Night", date: "2025-06-20", seats: 10 },
  { name: "Past Event", date: "2024-06-01", seats: 0 }
];
events.forEach(event => {
  const today = new Date();
  const eventDate = new Date(event.date);
  if (eventDate > today && event.seats > 0) {
    console.log(`Upcoming Event: ${event.name}`);
  } else {
    console.log(`Skipping: ${event.name}`);
  }
});
try {
  // simulate registration
  let selectedEvent = events[0];
  if (selectedEvent.seats <= 0) throw "No seats available!";
  selectedEvent.seats--;
  console.log("Registered successfully.");
} catch (err) {
  console.error("Registration failed:", err);
}
