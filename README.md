# 🌿 Leaf Village Group Chat  
## Java Multi-Client Chat Application (Socket Programming + Swing GUI)

A **multi-client real-time group chat application built in Java**, inspired by characters from the *Naruto* anime series.  
This desktop application uses **Java Socket Programming**, **AWT/Swing**, and **multithreading** to enable seamless communication between multiple users, each themed as a unique ninja from the **Leaf Village**.

---

## 🎥 Live Demo

👉 [Watch the Demo](https://drive.google.com/file/d/1_qSHQLhoC7B4YY_FE3pTCk_rOl1adMjC/view?usp=sharing)

---

## 🖼 Screenshots

<img width="1388" alt="Preview" src="https://github.com/user-attachments/assets/94c6411f-0568-4b47-bc03-d1949c71570e" />

---

## 📌 Description

This project showcases a **real-time multi-user chat application GUI** built using **Java Swing**.

### Interface Highlights
- Custom anime-themed chat window titled **The Leaf Village**
- Top bar displaying user avatars, chat name, and participants  
  (*Itachi, Naruto, Obito, Sasuke, Kakashi*)
- Messages displayed in **chat bubble format** with timestamps
- Custom **Leaf Village background image**
- Multiple users actively sending and receiving messages

This interface effectively demonstrates both **networking** and **GUI design skills** in a creative and themed manner.

---

## ✨ Features

- **Multithreaded Server** – Handles multiple client connections simultaneously  
- **Real-Time Chat** – Messages broadcast instantly to all connected users  
- **Custom GUI** – AWT/Swing-based UI with background images, rounded chat bubbles, and timestamps  
- **User Personalization** – Predefined characters (*Itachi, Naruto, Sasuke, Obito, Kakashi*)  
- **Themed Interface** – Naruto’s Leaf Village theme for enhanced visual engagement  

---

## 🛠 Tech Stack

- **Java**
- **Java AWT & Swing**
- **TCP Socket Programming**
- **Multithreading**
- **Object-Oriented Design**

---

## ⚙️ How It Works

### 🖥 Server (`Server.java`)
- Listens on port **2003**
- Creates a new thread for every connected client
- Maintains a list of active client writers
- Broadcasts incoming messages to all users

### 👤 Clients (`User1.java`, `User2.java`, ...)
- GUI-based client programs representing different characters
- Connect to the server using TCP sockets
- Send and receive messages in real time
- Custom UI styling with background images and timestamps

---

## 🎯 Learning Outcomes

- Strong understanding of **Java networking protocols**
- Hands-on experience with **multithreading and concurrency**
- Real-time synchronization between threads and UI updates
- Client–server architecture design
- Custom GUI development using Java Swing

---

## ▶️ How to Run the Project
-- Steps to Run

1. Clone the Repository
git clone https://github.com/hariniguptaemmadi/GroupChat-Application.git
cd GroupChat-Application
2. Open in your IDE
Open the project folder in your preferred Java IDE.
3. Compile the Java Files
Ensure all .java files (e.g., Server.java, Client.java) are compiled.
4. Run the Server
Start the Server.java class first to initialize the server.
You can run it via terminal or IDE:
java Server
5. Run the Client(s)
Then run Client.java. You can open multiple instances to simulate multiple clients joining the chat.
java Client

-- Notes

- Make sure the port number in Server.java and Client.java matches.
-  Ensure your firewall or antivirus doesn't block the Java network connection.
-   The UI is built using Java Swing.

----

## Future Enhancements

- Add **dynamic login/signup** with custom usernames.

- Include **file/image sharing** support.

- Implement basic encryption for message **privacy**.

- Chat **history** log.

---

## Author

Harini Emmadi

📧 [harini14738@gmail.com]

🔗 https://github.com/hariniguptaemmadi

