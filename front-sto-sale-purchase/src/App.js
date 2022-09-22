import React from "react";
import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import NavigationBar from "./components/NavigationBar";
// import SalesRegistrationPage from "./pages/SalesRegistrationPage";
import ListProductsSalePage from "./pages/ListProductsSalePage";
import MyPage from "./pages/MyPage";
import PurchasePage from "./pages/PurchasePage";

function App() {
  // const [message, setMessage] = useState([]);

  // useEffect(() => {
  //   fetch("/hello")
  //     .then((res) => {
  //       return res.json();
  //     })
  //     .then((data) => {
  //       setMessage(data);
  //     });
  // }, []);

  // const [member, setMember] = useState([]);
  // console.log("test", member);

  // useEffect(() => {
  //   fetch("/member/select")
  //     .then((res) => {
  //       return res.json();
  //     })
  //     .then((data) => {
  //       setMember(data);
  //     });
  // }, []);

  return (
    <div className="App">
      {/* <header className="App-header">
        <ul>
          {message.map((v, idx) => (
            <li key={`${idx}-${v}`}>{v}</li>
          ))}
        </ul>
        <ul>
          {member.map((v, idx) => (
            <li key={`${idx}-${v}`}>
              id: {v.id}, name : {v.name}, password : {v.password}
            </li>
          ))}
        </ul>
      </header> */}
      <BrowserRouter>
        <Routes>
          {/* <Route
            path="/salesRegistration"
            element={<SalesRegistrationPage />}
          ></Route> */}
          <Route
            path="/listProductsSale"
            element={<ListProductsSalePage />}
          ></Route>
          <Route path="/myPage" element={<MyPage />}></Route>
          <Route path="/purchase" element={<PurchasePage />}></Route>
        </Routes>
        <NavigationBar />
      </BrowserRouter>
    </div>
  );
}

export default App;
