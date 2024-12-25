# Quran Reading Tracker App

## Overview
The **Quran Reading Tracker** app is an Android application designed to help users track their progress in reading the Quran. Built using HTML, CSS, and JavaScript, it runs within a WebView to provide a seamless user experience. The app offers functionalities to mark reading progress, set goals, and view progress in both normal and chronological order of surahs.

## Features
- **Track Reading Progress**: Mark individual surahs as read or unread.
- **Dynamic Progress Calculation**: Real-time calculation of reading percentage.
- **Goal Setting**: Define completion dates and track daily progress.
- **Chronological and Normal Order**: Switch between normal and chronological order of surahs.
- **Data Persistence**: Stores progress and goals in the app's local storage.

## Components
### Key Files
1. **AndroidManifest.xml**
   - Sets app permissions (e.g., `INTERNET` and `ACCESS_NETWORK_STATE`).
   - Defines main activity and application metadata.

2. **index.html**
   - Main interface for users.
   - Contains buttons for goal management, reset functionality, and displays the surah list.

3. **index_.html**
   - Alternative interface for tracking surah percentages with simpler interactions.
   - Includes functionality for clearing progress and switching order.

### Core Functionalities
#### Surah List Rendering
- Displays all surahs with details like name, index, and completion percentage.
- Offers checkboxes to mark surahs as read.

#### Goal Management
- Allows users to set and reset completion goals.
- Displays detailed goal statistics, including estimated completion time and required daily progress.

#### Progress Tracking
- Tracks individual surah progress using character and verse calculations.
- Saves progress using `localStorage`.

#### Order Switching
- Supports toggling between:
  - Normal order (1 to 114).
  - Chronological order.

## Technologies Used
- **HTML5**: Structure of the app.
- **CSS3**: Styling for a modern and responsive design.
- **JavaScript**: Implements core logic for progress tracking, order switching, and goal management.
- **Android WebView**: Embeds the web-based interface within the Android application.
- **LocalStorage**: Data persistence within the app.

## Getting Started
### Prerequisites
- An Android device or emulator.

### Installation
1. Clone or download the project.
2. Open the project in Android Studio.
3. Build and run the app on an Android device or emulator.

### Usage
1. **Track Progress**:
   - Use checkboxes to mark surahs as read.
   - View real-time progress updates in the "Total Read" section.
2. **Set Goals**:
   - Click "Goal" to define a completion date.
   - Track remaining progress and required daily effort.
3. **Switch Order**:
   - Toggle between "Normal Order" and "Chronological Order" using respective buttons.
4. **Reset Progress**:
   - Click "Reset" to clear all data.

## Development Notes
### Directory Structure
- **assets/**: Contains HTML files and associated resources.
- **AndroidManifest.xml**: Manages app metadata and permissions.
- **WebView Implementation**: Configures the Android WebView to load and render the HTML interface.

### Future Enhancements
- Integration with cloud storage for cross-device synchronization.
- Support for multilingual interfaces.
- Enhanced analytics for reading pace and habit tracking.

## Contributing
Contributions are welcome! Please follow the steps below:
1. Fork the repository.
2. Create a feature branch.
3. Commit your changes.
4. Submit a pull request.

## License
This project is licensed under the [MIT License](LICENSE).

## Contact
For questions or support, please contact the developer team via email: **support@qurantracker.com**.

