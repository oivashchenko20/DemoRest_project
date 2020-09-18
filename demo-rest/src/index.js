import React from 'react';
import ReactDOM from 'react-dom';

import {Provider} from 'react-redux'

import { App } from './App';
import { configureStore } from './store';

import './index.css';


ReactDOM.render(
	<React.StrictMode>
		<Provider store={configureStore()}>
			<App></App>
		</Provider>
	</React.StrictMode>,
	document.getElementById('root')
);
