/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './scm/src/main/resources/templates/**/*.html', // for Thymeleaf
    './scm/src/main/resources/static/js/**/*.js'     // optional: if using JS
  ],
  theme: {
    extend: {},
  },
  plugins: [],
}
