import type { SyntheticEvent } from "react"

export default function StopPropagation() {
    const onDivClick = (e: SyntheticEvent) => console.log("Click Event Bubbles On <div>")
    const onButtonClick = (e: SyntheticEvent) => {
        console.log("Mouse Click Occurs On <button> and call stopPropagation")
        e.stopPropagation()
    }
    return (
        <div onClick={onDivClick}>
            <p>StopPropagation</p>
            <button onClick={onButtonClick}>Click Me And Stop Event Propagation</button>
        </div>
    )
}