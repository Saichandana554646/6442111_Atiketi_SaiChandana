function addEvent(name, category) {
  return { name, category };
}
function registerUser(user, event) {
  console.log(`${user} registered for ${event.name}`);
}
function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}
// Closure
function createCategoryTracker() {
  let count = 0;
  return function () {
    count++;
    return count;
  };
}
const trackMusic = createCategoryTracker();
console.log(trackMusic()); // 1
console.log(trackMusic())
