document.addEventListener("DOMContentLoaded", function () {
  const form = document.querySelector("#contact form");

  form.addEventListener("submit", function (e) {
    e.preventDefault(); // Prevent form from actually submitting

    const name = form.name.value.trim();
    const email = form.email.value.trim();
    const message = form.message.value.trim();

    if (!name || !email || !message) {
      alert("Please fill out all fields before submitting.");
      return;
    }

    // Simulated response (for now, just a fun popup)
    alert(`lami na kaayu ma tulog please ma'am e exempted ko sunod exam 😂\n\nLamat, ${name}! pahuway sa ko.`);

    form.reset(); // Clear the form
  });
});
