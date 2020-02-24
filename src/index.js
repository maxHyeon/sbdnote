import React from 'react';
import ReactDOM from 'react-dom';
import Root from './client/Root';
import * as ServiceWorker from 'serviceWorker';

ReactDOM.render(<Root />, document.getElementById('root'));
ServiceWorker.register();