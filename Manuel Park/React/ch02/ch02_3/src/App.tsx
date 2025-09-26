import ClassComponent from "./ClassComponent"
import ArrowComponent from "./ArrowComponent"

export default function App() {
    return (
        <ul>
            <ClassComponent href="http://www.google.com" text="Go To Google" />
            <ArrowComponent href="http://www.facebook.com" text="Go To Facebook" />
        </ul>
    )
}