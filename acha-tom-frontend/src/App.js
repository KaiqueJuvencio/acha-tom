// import React, { Component } from 'react';
// import './App.css';
// import axios from "axios";
// import CompNotasTom from "./components/CompNotasTom"
// import CompTom from "./components/CompTom"
// import 'react-app-polyfill/ie11';

// /**const api = {
//   baseURL: "E",
//   client_id: "",
//   client_secret: ""
// }**/

// class App extends Component {
//   constructor() {
//     super();
//     this.state = {
//       achatomData: []
//     }
//   }




//   getUser = (nota) => {
    
//     axios.get("http://localhost:8080/nota/" + nota)
//       .then((res) => {
//         console.log("Infos da API", res)
//         this.setState({ achatomData: res.data})
//       })
//   }

//   componentDidMount() {
//     axios.get("http://localhost:8080/")
//       .then((res) => {
//         console.log("Infos da API", res)
//         this.setState({ achatomData: res.data })
//       })
//   }

//   render() {
//     const { achatomData } = this.state;
//     return (
//       <table>
//         <tr>
//           {achatomData.map((jsonparam) => (
//             <React.Fragment>
//               <CompTom tom={jsonparam.nomeCampoHarmonico} />
//             </React.Fragment>
//           ))}
//         </tr>
//         <tr>
//           {achatomData.map((jsonparam) => (
//             <React.Fragment>
//               <CompNotasTom nota={jsonparam.do} onClick={this.getUser}/>
//             </React.Fragment>
//           ))}
//         </tr>
//         <tr>
//           {achatomData.map((jsonparam) => (
//             <React.Fragment>
//               <CompNotasTom nota={jsonparam.re} />
//             </React.Fragment>
//           ))}
//         </tr>
//         <tr>
//           {achatomData.map((jsonparam) => (
//             <React.Fragment>
//               <CompNotasTom nota={jsonparam.mi} />
//             </React.Fragment>
//           ))}
//         </tr>
//         <tr>
//           {achatomData.map((jsonparam) => (
//             <React.Fragment>
//               <CompNotasTom nota={jsonparam.fa} />
//             </React.Fragment>
//           ))}
//         </tr>
//         <tr>
//           {achatomData.map((jsonparam) => (
//             <React.Fragment>
//               <CompNotasTom nota={jsonparam.sol} />
//             </React.Fragment>
//           ))}
//         </tr>
//         <tr>
//           {achatomData.map((jsonparam) => (
//             <React.Fragment>
//               <CompNotasTom nota={jsonparam.la} />
//             </React.Fragment>
//           ))}
//         </tr>
//         <tr>
//           {achatomData.map((jsonparam) => (
//             <React.Fragment>
//               <CompNotasTom nota={jsonparam.si} />
//             </React.Fragment>
//           ))}
//         </tr>
//       </table>
//     )
//   }
// }

// export default App;
import React from 'react';
import Routes from './routes';


function App(){
  return (
    <Routes/>
  );
}

export default App;