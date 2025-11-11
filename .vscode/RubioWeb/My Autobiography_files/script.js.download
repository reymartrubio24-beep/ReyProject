let slideIndex = 0;
    let slideInterval;

    function showSlides(next = true) {
        let slides = document.querySelectorAll(".slide");
        let background = document.getElementById("background");

        slides[slideIndex].style.display = "none";
        slideIndex = next ? (slideIndex + 1) % slides.length : (slideIndex - 1 + slides.length) % slides.length;
        slides[slideIndex].style.display = "block";

        let imgSrc = slides[slideIndex].querySelector("img").src;
        background.style.backgroundImage = `url('${imgSrc}')`;
    }

    function plusSlides(n) {
        clearInterval(slideInterval);
        showSlides(n > 0);
        slideInterval = setInterval(() => showSlides(true), 3000);
    }

    function startSlideshow() {
        let slides = document.querySelectorAll(".slide");
        slides[slideIndex].style.display = "block";

        let imgSrc = slides[slideIndex].querySelector("img").src;
        document.getElementById("background").style.backgroundImage = `url('${imgSrc}')`;

        slideInterval = setInterval(() => showSlides(true), 3000);
    }

    document.addEventListener("DOMContentLoaded", startSlideshow);