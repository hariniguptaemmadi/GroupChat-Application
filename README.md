# 🌿 Leaf Village Group Chat (Java Socket Programming + GUI)

A multi-client real-time group chat application built in Java, inspired by characters from the Naruto anime series. This desktop app uses **Java Socket Programming**, **AWT/Swing**, and **multithreading** to simulate seamless communication between multiple users, each themed as a unique ninja from the *Leaf Village*.

## 🌟 Live Preview

![Leaf Village Chat Preview](../icons/Preview.png)

---

## ✨ Features

- 🧠 **Multithreaded Server**: Handles multiple client connections simultaneously.
- 💬 **Real-Time Chat**: Messages are broadcasted instantly across all connected clients.
- 🎨 **Custom GUI**: AWT/Swing-based UI with background image, rounded chat bubbles, and timestamps.
- 🎭 **User Personalization**: Predefined characters like *Itachi, Naruto, Sasuke, Obito, Kakashi* simulate a team chat environment.
- 🖼️ **Themed Interface**: Naruto’s Leaf Village as the background — improves visual engagement.

---

## 🧰 Tech Stack

- **Java**  
- **Java AWT & Swing**  
- **TCP Socket Programming**  
- **Multithreading**  
- **Object-Oriented Design**

---

## 🚀 How It Works

1. **Server.java**  
   - Listens on a port (`2003`) and creates a new thread for every connected user.
   - Maintains a list of active writers to broadcast messages.

2. **User1.java, User2.java, ...**  
   - GUI client programs representing different characters.
   - Connects to the server and sends/receives chat messages.
   - Custom styling with image backgrounds and timestamps.

---

## 📸 Screenshots

| User 1 (Itachi) | User 2 (Naruto) | User 3 (Sasuke) |
|----------------|----------------|----------------|
| ![Itachi](screenshots/itachi.png) | ![Naruto](screenshots/naruto.png) | ![Sasuke](screenshots/sasuke.png) |

---

## 🎯 Learning Outcomes

- Developed a strong understanding of **network protocols** and **concurrent programming** in Java.
- Built real-time synchronization between threads and UI updates.
- Gained experience in **custom GUI design**, error handling, and client-server architecture.

---

## 📌 Future Enhancements

Add dynamic login/signup with custom usernames
Include file/image sharing support
Implement basic encryption for message privacy
Chat history log

## 👩‍💻 Author

Harini Emmadi
📧 [harini14738@gmail.com]
🔗 https://github.com/hariniguptaemmadi

