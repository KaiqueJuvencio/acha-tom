import React from 'react';

const CompNotasTom = (props) => {
    return (
        <td><button name="tombutton" value={props.nota} onClick={props.onClick}>{props.nota}</button></td>
    )
}

export default CompNotasTom;