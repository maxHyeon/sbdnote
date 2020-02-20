import React from 'react';
import logo from './logo.svg';
import topBar from './topBar'
import './App.css';
var topBar2 = topBar.PrimarySearchAppBar();
function App() {
  return (
    <div className="App">
      ${topBar2}
      
    </div>
  );
}

export default App;
