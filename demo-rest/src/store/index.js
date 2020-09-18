import {applyMiddleware, createStore} from "redux"
import thunk from 'redux-thunk'

import { root } from "./reducers"


export const configureStore = () => {
    const store = createStore(root, applyMiddleware(thunk))

    return store
}