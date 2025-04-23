import { initializeApp } from 'firebase/app';
import { getAuth } from 'firebase/auth';

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyC3La6IEF6TEnRcVOn_F3NdjsAjv9rmKo4",
  authDomain: "softwareengineer-b25ab.firebaseapp.com",
  projectId: "softwareengineer-b25ab",
  storageBucket: "softwareengineer-b25ab.firebasestorage.app",
  messagingSenderId: "313902152010",
  appId: "1:313902152010:web:ed24ab5c9d47447cd029b3",
  measurementId: "G-6NX0JWH6M2"
};


// Initialize Firebase
const app = initializeApp(firebaseConfig);
export const auth = getAuth(app);
export default app; 