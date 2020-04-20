import React from 'react';
import { BrowserRouter, Route, Switch} from 'react-router-dom';
import AchaTomPage from './pages/AchaTom';

export default function Routes(){
    return(
        <BrowserRouter>
            <Switch>
                <Route path="/" exact component={AchaTomPage}/>
            </Switch>
        </BrowserRouter>
    )
}