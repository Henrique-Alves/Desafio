import React, { Component } from 'react';
import Header from '../app/header';
import Card from '../app/card';
import MainLayout from './main';
import { BrowserRouter, Switch, Route } from "react-router-dom";


class App extends Component {
  render() {
    return (
      <BrowserRouter>
      <MainLayout>
        <Switch>
          <Route exact path="/" component={Header} />
          <Route path="/card" component={Card} />
        </Switch>
      </MainLayout>
    </BrowserRouter>
    );
  }
}

export default App;
