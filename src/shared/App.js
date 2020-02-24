import React from 'react';
import TopBar from 'components/topBar'
import { Route,Switch } from 'react-router-dom';
import 'App.css';
import {Landing,WorkDetail} from 'pages'
function App() {
  
  return (
    <div className="App">
      <TopBar/>
      <Switch>
        <Route exact path="/" component={Landing}/>
        <Route path="/record" component={WorkDetail}/>
      </Switch>
    </div>
  );
}

export default App;
