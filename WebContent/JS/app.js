// app.js

// Search Functionality for Therapist Cards
document.getElementById('searchInput').addEventListener('input', function () {
    const searchQuery = this.value.toLowerCase();
    const therapistCards = document.querySelectorAll('.therapist-card');

    therapistCards.forEach(card => {
        const name = card.querySelector('.card-title').textContent.toLowerCase();
        const description = card.querySelector('.card-text').textContent.toLowerCase();
        
        if (name.includes(searchQuery) || description.includes(searchQuery)) {
            card.style.display = 'block'; // Show card
        } else {
            card.style.display = 'none'; // Hide card
        }
    });
});

// Book a Session Alert (just a basic alert for now)
const bookSessionButtons = document.querySelectorAll('.book-session');
bookSessionButtons.forEach(button => {
    button.addEventListener('click', function (event) {
        event.preventDefault(); // Prevent default action
        const therapistName = button.closest('.card').querySelector('.card-title').textContent;
        alert(`You have booked a session with ${therapistName}`);
    });
});

// Smooth Scroll (for better navigation)
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();
        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});
