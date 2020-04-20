import React, { useState } from 'react';
import api from '../../services/api';
import '../../App.css';

export default function AchaTomPage() {
    const [tons, setTons] = useState([]);
    const NotesComponent = (note) => {
        return (
            <table>
                <tr>
                    {tons.map(tom => (<th>{tom.nomeCampoHarmonico}</th>))}
                </tr>
                <tr>
                    {tons.map(tom => (<td><button onClick={() => handleGetTomC(tom.do)} name="tombutton">{tom.do}</button></td>))}
                </tr>
                <tr>
                    {tons.map(tom => (<td><button onClick={() => handleGetTomC(tom.re)} name="tombutton">{tom.re}</button></td>))}
                </tr>
                <tr>
                    {tons.map(tom => (<td><button onClick={() => handleGetTomC(tom.mi)} name="tombutton">{tom.mi}</button></td>))}
                </tr>
                <tr>
                    {tons.map(tom => (<td><button onClick={() => handleGetTomC(tom.fa)} name="tombutton">{tom.fa}</button></td>))}
                </tr>
                <tr>
                    {tons.map(tom => (<td><button onClick={() => handleGetTomC(tom.sol)} name="tombutton">{tom.sol}</button></td>))}
                </tr>
                <tr>
                    {tons.map(tom => (<td><button onClick={() => handleGetTomC(tom.la)} name="tombutton">{tom.la}</button></td>))}
                </tr>
                <tr>
                    {tons.map(tom => (<td><button onClick={() => handleGetTomC(tom.si)} name="tombutton">{tom.si}</button></td>))}
                </tr>
            </table >
        )
    }

    function handleGetTom() {
        api.get('/').then(response => {
            setTons(response.data);
        });
        console.log(tons);
    }

    
    async function handleGetTomC(id) {
        await api.get(`/nota/${id}`).then(response => {
            setTons(response.data);
        });
        console.log(tons);
    }


    return (
        <div className="acha-tom-container">
            <button onClick={handleGetTom} type="button">Lets Start</button>
            <NotesComponent />
        </div>
    );
}